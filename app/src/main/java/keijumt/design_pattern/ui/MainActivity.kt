package keijumt.design_pattern.ui

import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import keijumt.design_pattern.R
import keijumt.design_pattern.ui.ui.main.BaseActivity
import keijumt.design_pattern.ui.ui.main.MainFragment
import keijumt.design_pattern.ui.ui.main.MainViewModel
import keijumt.design_pattern.ui.ui.main.SubFragment
import java.util.*

class MainActivity : BaseActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        val observer: Observer = object : Observer {
            override fun update(observable: Observable?, value: Any?) {
                Toast.makeText(this@MainActivity, value?.toString(), Toast.LENGTH_SHORT).show()
            }
        }

        viewModel.addObserver(observer)
        viewModel.process()


        val mainFragment = MainFragment()
        val subFragment = SubFragment()

        // ポリモーフィズムを使わない
        addMainFragment(mainFragment, R.id.container)
        addSubFragment(subFragment, R.id.container)

        // ポリモーフィズムを使う
        addFragment(mainFragment, R.id.container)
        addFragment(subFragment, R.id.container)
    }

}
