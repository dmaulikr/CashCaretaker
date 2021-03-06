package com.androidessence.cashcaretaker.activities

import android.os.Bundle

import com.androidessence.cashcaretaker.R
import com.androidessence.cashcaretaker.core.CoreActivity

/**
 * Activity that allows a user to add a repeating transaction.

 * Created by adam.mcneilly on 9/5/16.
 */
class AddRepeatingTransactionActivity : CoreActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_repeating_transaction)

        setupToolbar(true)
    }
}
