package arb.test.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_test , menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item != null)
            when(item.itemId){
                R.id.kotlin -> {
                    Toast.makeText(this,"What is Kotlin ?\n" +
                            "Kotlin is a statically-typed programming language for modern multi-platform applications.  Kotlin was developed by JetBrains, a company acclaimed for developing tools for professionals. The foremost goal of Kotlin is to provide a concise, productive and safer alternative to Java. The most common areas to use Kotlin are\n" +
                            "Building server-side code\n" +
                            "Building mobile applications that run on Android devices",Toast.LENGTH_LONG).show()
                }
                R.id.info -> {
                    Toast.makeText(this,"GitHub.com/alirezsbashi",Toast.LENGTH_SHORT).show()
                }
                R.id.about -> {
                    Toast.makeText(this,"im AlirezaBashi programming android",Toast.LENGTH_SHORT).show()
                }
            }

        return true
    }
}
