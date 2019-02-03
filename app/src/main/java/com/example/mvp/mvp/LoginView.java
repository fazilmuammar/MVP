package com.example.mvp.mvp;

public interface LoginView {
    /**
     * Menampilkan toast validation error.
     * Sebuah interface yang berisi fungsi2 yang akan dijalankan pada LoginActivity, menghubungkan Presenter ke View.
     */
    void showValidationError();
    /**
     * Login success.
     */
    void loginSuccess();
    /**
     * Menampilkan toast login error.
     */
    void loginError();
}