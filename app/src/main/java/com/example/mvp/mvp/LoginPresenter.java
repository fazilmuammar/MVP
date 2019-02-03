package com.example.mvp.mvp;

public interface LoginPresenter {

    // sebuah interface yang berisi nama fungsi-fungsi logika dari class LoginActivity.
    // Menghubungkan View dengan Presenter.
    void MyLogin(String username, String password);
}