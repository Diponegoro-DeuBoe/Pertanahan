package id.deuboe.pemkabkra.pertanahan.ui.fragments

import android.app.Activity
import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import id.deuboe.pemkabkra.pertanahan.model.Choose
import id.deuboe.pemkabkra.pertanahan.util.Util

class HomeViewModel : ViewModel() {

    private var _listChoose = MutableLiveData<List<Choose>>()
    internal val listChoose: LiveData<List<Choose>> = _listChoose

    init {
        _listChoose.value = Util.listChoose
    }

    internal fun setSignInClient(idToken: String, context: Context): GoogleSignInClient {
        val googleSignInOptions = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestEmail()
            .requestIdToken(idToken)
            .build()
        return GoogleSignIn.getClient(context as Activity, googleSignInOptions)
    }

}