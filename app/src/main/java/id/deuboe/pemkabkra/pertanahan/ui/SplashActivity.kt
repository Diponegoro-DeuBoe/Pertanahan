package id.deuboe.pemkabkra.pertanahan.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.common.api.ApiException
import com.google.android.material.snackbar.Snackbar
import id.deuboe.pemkabkra.pertanahan.R
import id.deuboe.pemkabkra.pertanahan.databinding.ActivitySplashBinding
import kotlinx.coroutines.flow.collect

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding
    private val viewModel: SplashViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        lifecycleScope.launchWhenStarted {
            viewModel.loginUiState.collect {
                when (it) {
                    is SplashViewModel.LoginUiState.Default -> Unit
                    is SplashViewModel.LoginUiState.Error -> {
                        Snackbar.make(
                            binding.root,
                            it.message,
                            Snackbar.LENGTH_LONG
                        ).show()
                    }
                    is SplashViewModel.LoginUiState.Success -> {
                        Intent(this@SplashActivity, MainActivity::class.java).also { intent ->
                            startActivity(intent)
                            finish()
                        }
                    }
                }
            }
        }

        binding.buttonSignIn.apply {
            setOnClickListener {
                openSignInIntent()
            }
        }
    }

    private var resultLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val task = GoogleSignIn.getSignedInAccountFromIntent(result.data)
                try {
                    val account = task.getResult(ApiException::class.java)
                    account?.let { viewModel.authGoogle(account) }
                } catch (e: ApiException) {
                    Toast.makeText(this, e.message, Toast.LENGTH_LONG).show()
                    e.message?.let { Log.d("SplashActivity", it) }
                }
            }
        }

    private fun openSignInIntent() {
        viewModel.setSignInClient(getString(R.string.default_web_client_id), this)
            .signInIntent.also {
                resultLauncher.launch(it)
            }
    }

    override fun onStart() {
        super.onStart()
        viewModel.checkUser()
    }
}