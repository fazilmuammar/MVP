package com.example.mvp.mvp;

import android.text.TextUtils;

public class LoginPresenterImp implements LoginPresenter {
    /**
     * The login view.
     */
    private LoginView loginView;

    /**
     * Membuat sebuah login presenter impl baru.
     *
     * @param loginView the login view
     */
    public LoginPresenterImp(LoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void MyLogin(String username, String password) {
        if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
            loginView.showValidationError();
        } else {
            if (username.equals("admin") && password.equals("admin")) {
                loginView.loginSuccess();
            } else {
                loginView.loginError();
            }
        }
    }
}