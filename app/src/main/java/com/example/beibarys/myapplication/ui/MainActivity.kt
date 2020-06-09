package com.example.beibarys.myapplication.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.beibarys.myapplication.R
import com.example.beibarys.myapplication.model.Mosque
import com.example.beibarys.myapplication.repository.FakeMosqueRepository
import com.example.beibarys.myapplication.repository.MosqueRepository
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val repository: MosqueRepository = FakeMosqueRepository()

        mosqueRecyclerView.apply {
            adapter = MosqueAdapter(repository.getMosque(), ::itemClick)
            layoutManager = LinearLayoutManager(this@MainActivity)
        }

        bottom_navigation.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.action_search -> {
                    loadFragment(FragmentInfo())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_home -> {
                    search.visibility = View.GONE
                    search_button.visibility = View.VISIBLE
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_exit -> {
                    intent = Intent(this, LoginActivity::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
                    return@setOnNavigationItemSelectedListener true
                }
                else -> return@setOnNavigationItemSelectedListener false
            }
        }
    }
    private fun loadFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().also { fragmentTransaction ->
            fragmentTransaction.replace(R.id.full_screen, fragment)
            fragmentTransaction.commit()
        }
    }

    private fun itemClick(mosque: Mosque){
        // TODO implement item click handle
        val intent = Intent(this, MosqueInfoActivity::class.java).apply{
            putExtra(IMAGE_INFO, mosque.getImage().toTypedArray())
            putExtra(MAIN_INFO_MESSAGE, mosque.getInfo())
            putExtra(FULL_INFO_MESSAGE, mosque.getFullInfo())
        }
        startActivity(intent)
    }
    fun searchClick(view: View){
        search.visibility = View.VISIBLE
        search_button.visibility = View.INVISIBLE
    }
    companion object {
        const val IMAGE_INFO: String = "IMAGE_INFO"
        const val MAIN_INFO_MESSAGE: String = "MAIN_INFO_MESSAGE"
        const val FULL_INFO_MESSAGE: String = "FULL_INFO_MESSAGE"
    }
}
