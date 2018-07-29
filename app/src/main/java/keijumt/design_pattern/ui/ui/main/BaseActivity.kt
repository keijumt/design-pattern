package keijumt.design_pattern.ui.ui.main

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    /**
     * MainFragmentを指定のViewに貼り付ける。
     *
     * @param fragment 貼り付けるFragment
     * @param containerViewId コンテナViewのID
     */
    fun addMainFragment(fragment: MainFragment, containerViewId: Int) {
        supportFragmentManager
                .beginTransaction()
                .add(containerViewId, fragment)
                .commit()
    }
}