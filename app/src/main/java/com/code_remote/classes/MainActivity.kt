package com.code_remote.classes

import android.os.Bundle
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil.setContentView
import androidx.databinding.InverseBindingAdapter
import androidx.databinding.InverseBindingListener
import androidx.lifecycle.MutableLiveData
import com.code_remote.classes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val myVarOwnerObject = AccountOwner()
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this
        binding.accountOwner = myVarOwnerObject

        myVarOwnerObject.owner.value = "TEST VALUE"

        setContentView(binding.root)

        binding.testButton.setOnClickListener {
            binding.testText.text =
                "owner: ${myVarOwnerObject.owner.value}\nradioID: ${myVarOwnerObject.radioID.value}"
        }
    }
}


class AccountOwner {
    val owner: MutableLiveData<String> = MutableLiveData<String>()
    val radioID: MutableLiveData<String> = MutableLiveData("ME")
}

@BindingAdapter(value = ["customAccountOwner", "android:checkedButtonAttrChanged"], requireAll = false)
fun onRadioChecked(
    radioGroupView: RadioGroup,
    customAccountOwner: String,
    otherView: RadioButton,
    listener: InverseBindingListener
) {

    val toCheckId = when (customAccountOwner) {
        "ME" -> R.id.me
        "SPOUS" -> R.id.spous
        "JOINT" -> R.id.joint
        else -> -1
    }

    if (toCheckId != -1 && radioGroupView.checkedRadioButtonId != toCheckId) {
        otherView.isChecked = false
        radioGroupView.check(toCheckId)
    }
    radioGroupView.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->
        listener.onChange()
    })
}

@InverseBindingAdapter(attribute = "customAccountOwner", event = "android:checkedButtonAttrChanged")
fun onRadioCheckChanged(view: RadioGroup): String? {
    return when (view.checkedRadioButtonId) {
        R.id.me -> "ME"
        R.id.spous -> "SPOUS"
        else -> "JOINT"
    }
}

@BindingAdapter(value = ["android:text", "android:textAttrChanged"], requireAll = false)
fun setEditTextValue(editText: EditText, textValue: String?, listener: InverseBindingListener) {
    if (editText.text.toString() != textValue) {
        editText.setText(textValue)
    }
    editText.doAfterTextChanged { listener.onChange() }
}

@InverseBindingAdapter(attribute = "android:text", event = "android:textAttrChanged")
fun getEditTextValue(view: EditText): String? {
    return view.text.toString()
}