package id.deuboe.pemkabkra.pertanahan.ui.fragments

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import id.deuboe.pemkabkra.pertanahan.model.Item
import id.deuboe.pemkabkra.pertanahan.model.Persyaratan
import id.deuboe.pemkabkra.pertanahan.util.Util

class DetailViewModel : ViewModel() {

    private var _listPersyaratan = MutableLiveData<List<Item>>()
    internal val listPersyaratan: LiveData<List<Item>> = _listPersyaratan

    private var _indexItem = MutableLiveData<Int>()
    private val indexItem: LiveData<Int> = _indexItem

    internal fun indexItem(index: Int) {
        _indexItem.value = index
    }

    init {

    }
}