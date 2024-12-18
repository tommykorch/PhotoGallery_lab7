package com.example.mobile_development_lab_07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobile_development_lab_07.ui.main.FavoritesFragment

class FavoritesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorites)

        val isFragmentContainerEmpty = savedInstanceState == null


        if (isFragmentContainerEmpty) {
            supportFragmentManager // Получаем экземпляр FragmentManager для управления фрагментами
                .beginTransaction() // Начинаем транзакцию фрагментов
                .add(R.id.container, FavoritesFragment.newInstance()) // Добавляем новый экземпляр фрагмента в контейнер
                .commit()
        }
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}