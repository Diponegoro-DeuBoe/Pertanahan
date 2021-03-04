package id.deuboe.pemkabkra.pertanahan.ui

import android.app.Activity
import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.firebase.auth.AuthCredential
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext

class SplashViewModel : ViewModel() {

    companion object {
        val auth = FirebaseAuth.getInstance()
    }

    private val _loginUiState = MutableStateFlow<LoginUiState>(LoginUiState.Default)
    internal val loginUiState: StateFlow<LoginUiState> = _loginUiState

    sealed class LoginUiState {
        object Default : LoginUiState()
        data class Error(val message: String) : LoginUiState()
        object Success : LoginUiState()
    }

    internal fun authGoogle(account: GoogleSignInAccount) =
        viewModelScope.launch {
            try {
                setAuth(setCredential(account))
                _loginUiState.value = LoginUiState.Success
            } catch (e: Exception) {
                _loginUiState.value = LoginUiState.Error(e.message!!)
            }
        }

    private fun setCredential(account: GoogleSignInAccount) =
        GoogleAuthProvider.getCredential(account.idToken, null)

    private suspend fun setAuth(credential: AuthCredential) =
        auth.signInWithCredential(credential).await()

    internal fun setSignInClient(idToken: String, context: Context): GoogleSignInClient {
        val googleSignInOptions = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestEmail()
            .requestIdToken(idToken)
            .build()
        return GoogleSignIn.getClient(context, googleSignInOptions)
    }

    internal fun checkUser() = viewModelScope.launch {
        val user = auth.currentUser
        if (user != null) {
            _loginUiState.value = LoginUiState.Success
        }
    }
}