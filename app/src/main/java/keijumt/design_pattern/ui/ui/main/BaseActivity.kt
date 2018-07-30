package keijumt.design_pattern.ui.ui.main

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

abstract class BaseActivity : AppCompatActivity() {

    /**
     * Fragmentを指定のViewに貼り付ける。
     * ポリモーフィズムを使っているため、Fragmentを継承してる
     * オブジェクトならどのクラスでもaddできる
     *
     * @param fragment 貼り付けるFragment
     * @param containerViewId コンテナViewのID
     */
    protected fun addFragment(fragment: Fragment, containerViewId: Int) {
        supportFragmentManager
                .beginTransaction()
                .add(containerViewId, fragment)
                .commit()
    }

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

    /**
     * SubFragmentを指定のViewに貼り付ける。
     *
     * @param fragment 貼り付けるFragment
     * @param containerViewId コンテナViewのID
     */
    fun addSubFragment(fragment: SubFragment, containerViewId: Int) {
        supportFragmentManager
                .beginTransaction()
                .add(containerViewId, fragment)
                .commit()
    }
}