package id.deuboe.pemkabkra.pertanahan.adapter

import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textview.MaterialTextView
import id.deuboe.pemkabkra.pertanahan.databinding.ItemRecyclerChoiceBinding
import id.deuboe.pemkabkra.pertanahan.model.Choose
import kotlin.Int.Companion.MAX_VALUE

class ChooseAdapter(private val itemClickListener: OnItemClickListener) :
    ListAdapter<Choose, ChooseAdapter.ChooseViewHolder>(ChooseDiffCallback) {

    inner class ChooseViewHolder(itemView: ItemRecyclerChoiceBinding) :
        RecyclerView.ViewHolder(itemView.root) {
        private val binding = itemView

        fun bind(choose: Choose, clickListener: OnItemClickListener) {
            binding.apply {
                textTitle.text = choose.title
                textSubtitle.apply {
                    text = choose.subtitle
                    maxLines = 3
                    ellipsize = TextUtils.TruncateAt.END
                }
                textAll.apply {
                    text = "Lebih banyak"
                    setOnClickListener {
                        clickListener.onAllClicked(choose, textSubtitle, this)
                    }
                    visibility = if (textSubtitle.lineCount > 3) View.GONE else View.VISIBLE
                }
                iconNext.setOnClickListener {
                    clickListener.onIconClicked(choose)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChooseViewHolder {
        val itemView = ItemRecyclerChoiceBinding.inflate(LayoutInflater.from(parent.context),
        parent, false)
        return ChooseViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ChooseViewHolder, position: Int) {
        holder.bind(getItem(position), itemClickListener)
    }

    object ChooseDiffCallback : DiffUtil.ItemCallback<Choose>() {
        override fun areItemsTheSame(oldItem: Choose, newItem: Choose) =
            oldItem == newItem

        override fun areContentsTheSame(oldItem: Choose, newItem: Choose) =
            oldItem.id == newItem.id
    }
}

interface OnItemClickListener {
    fun onIconClicked(choose: Choose)
    fun onAllClicked(choose: Choose, textSubtitle: MaterialTextView, textAll: MaterialTextView)
}