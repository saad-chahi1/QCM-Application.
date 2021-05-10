package com.example.recyclerview

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import com.example.qcmtest.*
import com.example.tachen3_final.DataBaseHandler
import kotlinx.android.synthetic.main.frag_b.*


class FragB : Fragment() {

    var score = 0
    var var1 = 0
    var var2 = 0
    var var3 = 0
    var var4 = 0
    var var5 = 0
    var var6 = 0
    var var7 = 0

    lateinit var textviewQ1 : TextView
    lateinit var textviewQ2 : TextView
    lateinit var textviewQ3 : TextView
    lateinit var textviewQ4 : TextView
    lateinit var textviewQ5 : TextView
    lateinit var textviewQ6 : TextView
    lateinit var textviewQ7 : TextView

    lateinit var radioGrp1 : RadioGroup
    lateinit var radioGrp2 : RadioGroup
    lateinit var radioGrp3 : RadioGroup
    lateinit var radioGrp4 : RadioGroup
    lateinit var radioGrp5 : RadioGroup
    lateinit var radioGrp6 : RadioGroup
    lateinit var radioGrp7 : RadioGroup

    lateinit var radioButton1 : RadioButton
    lateinit var radioButton2 : RadioButton
    lateinit var radioButton3 : RadioButton
    lateinit var radioButton4 : RadioButton
    lateinit var radioButton5 : RadioButton
    lateinit var radioButton6 : RadioButton
    lateinit var radioButton7 : RadioButton
    lateinit var radioButton8 : RadioButton
    lateinit var radioButton9 : RadioButton
    lateinit var radioButton10 : RadioButton
    lateinit var radioButton11 : RadioButton
    lateinit var radioButton12 : RadioButton
    lateinit var radioButton13 : RadioButton
    lateinit var radioButton14 : RadioButton


    lateinit var textView2 : TextView
    lateinit var imageView : ImageView
    lateinit var generate_result_button : Button
    lateinit var verify_result_button : Button

    var questionListe : MutableList<Question> = ArrayList()
    var reponseListe : MutableList<Reponse> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        var view : View = inflater.inflate(R.layout.frag_b, container, false)
        textView2 = view.findViewById(R.id.textview2)
        imageView = view.findViewById(R.id.imageView)


        return view
    }

    override fun onActivityCreated(@Nullable savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        var db = getActivity()?.let { DataBaseHandler(it) }
        val arguments = arguments
        if (arguments != null) {

            val definition = arguments["definition"].toString()
            val title : String = arguments["title"].toString()
            val source = arguments["image"]

            questionListe = db!!.readQuestion(title)
            val randomList = (0..7).shuffled().take(7)


            textviewQ1= view?.findViewById<TextView>(R.id.textView2)!!
            textviewQ1.setText(questionListe[randomList[0]].question)

            textviewQ2= view?.findViewById<TextView>(R.id.textView3)!!
            textviewQ2.setText(questionListe[randomList[1]].question)

            textviewQ3= view?.findViewById<TextView>(R.id.textView4)!!
            textviewQ3.setText(questionListe[randomList[2]].question)

            textviewQ4= view?.findViewById<TextView>(R.id.textView5)!!
            textviewQ4.setText(questionListe[randomList[3]].question)

            textviewQ5= view?.findViewById<TextView>(R.id.textView6)!!
            textviewQ5.setText(questionListe[randomList[4]].question)

            textviewQ6= view?.findViewById<TextView>(R.id.textView7)!!
            textviewQ6.setText(questionListe[randomList[5]].question)

            textviewQ7= view?.findViewById<TextView>(R.id.textView8)!!
            textviewQ7.setText(questionListe[randomList[6]].question)

            radioButton1 = view?.findViewById(R.id.radioButton)!!
            radioButton2 = view?.findViewById(R.id.radioButton2)!!
            radioButton3 = view?.findViewById(R.id.radioButton3)!!
            radioButton4 = view?.findViewById(R.id.radioButton4)!!
            radioButton5 = view?.findViewById(R.id.radioButton5)!!
            radioButton6 = view?.findViewById(R.id.radioButton6)!!
            radioButton7 = view?.findViewById(R.id.radioButton7)!!
            radioButton8 = view?.findViewById(R.id.radioButton8)!!
            radioButton9 = view?.findViewById(R.id.radioButton9)!!
            radioButton10 = view?.findViewById(R.id.radioButton10)!!
            radioButton11 = view?.findViewById(R.id.radioButton11)!!
            radioButton12 = view?.findViewById(R.id.radioButton12)!!
            radioButton13 = view?.findViewById(R.id.radioButton13)!!
            radioButton14 = view?.findViewById(R.id.radioButton14)!!

            radioGrp1 = view?.findViewById(R.id.radioGroup1)!!
            radioGrp2 = view?.findViewById(R.id.radioGroup2)!!
            radioGrp3 = view?.findViewById(R.id.radioGroup3)!!
            radioGrp4 = view?.findViewById(R.id.radioGroup4)!!
            radioGrp5 = view?.findViewById(R.id.radioGroup5)!!
            radioGrp6 = view?.findViewById(R.id.radioGroup6)!!
            radioGrp7 = view?.findViewById(R.id.radioGroup7)!!

            //buttonRadio
            reponseListe = db!!.readData(questionListe[randomList[0]].question)
            (radioGroup1.getChildAt(0) as RadioButton).setText(reponseListe[0].repons)
            val state1:  Int = reponseListe[0].state
            (radioGroup1.getChildAt(1) as RadioButton).setText(reponseListe[1].repons)
            val state2:  Int = reponseListe[1].state


            radioButton1.setOnClickListener(object : View.OnClickListener{

                override fun onClick(v: View?) {
                    if(state1 == 1){
                        var1=0
                        var1++
                    }else{
                        var1 = 0
                    }
                }
            })
            radioButton2.setOnClickListener(object : View.OnClickListener{
                override fun onClick(v: View?) {
                    if(state2 == 1){
                        var1=0
                        var1++
                    }else{
                        var1 = 0
                    }
                }
            })

            reponseListe = db!!.readData(questionListe[randomList[1]].question)
            (radioGroup2.getChildAt(0) as RadioButton).setText(reponseListe[0].repons)
            val state3:  Int = reponseListe[0].state
            (radioGroup2.getChildAt(1) as RadioButton).setText(reponseListe[1].repons)
            val state4:  Int = reponseListe[1].state
            radioButton3.setOnClickListener(object : View.OnClickListener{
                override fun onClick(v: View?) {
                    if(state3 == 1){
                        var2=0
                        var2++
                    }else{
                        var2 = 0
                    }
                }
            })
            radioButton4.setOnClickListener(object : View.OnClickListener{
                override fun onClick(v: View?) {
                    if(state4 == 1){
                        var2=0
                        var2++
                    }else{
                        var2 = 0
                    }
                }
            })

            reponseListe = db!!.readData(questionListe[randomList[2]].question)
            (radioGroup3.getChildAt(0) as RadioButton).setText(reponseListe[0].repons)
            val state5:  Int = reponseListe[0].state
            (radioGroup3.getChildAt(1) as RadioButton).setText(reponseListe[1].repons)
            val state6:  Int = reponseListe[1].state
            radioButton5.setOnClickListener(object : View.OnClickListener{
                override fun onClick(v: View?) {
                    if(state5 == 1){
                        var3=0
                        var3++
                    }else{
                        var3 = 0
                    }
                }
            })
            radioButton6.setOnClickListener(object : View.OnClickListener{
                override fun onClick(v: View?) {
                    if(state6 == 1){
                        var3=0
                        var3++
                    }else{
                        var3 = 0
                    }
                }
            })

            reponseListe = db!!.readData(questionListe[randomList[3]].question)
            (radioGroup4.getChildAt(0) as RadioButton).setText(reponseListe[0].repons)
            val state7:  Int = reponseListe[0].state
            (radioGroup4.getChildAt(1) as RadioButton).setText(reponseListe[1].repons)
            val state8:  Int = reponseListe[1].state
            radioButton7.setOnClickListener(object : View.OnClickListener{
                override fun onClick(v: View?) {
                    if(state7 == 1){
                        var6=0
                        var6++
                    }else{
                        var6 = 0
                    }
                }
            })
            radioButton8.setOnClickListener(object : View.OnClickListener{
                override fun onClick(v: View?) {
                    if(state8 == 1){
                        var6=0
                        var6++
                    }else{
                        var6 = 0
                    }
                }
            })

            reponseListe = db!!.readData(questionListe[randomList[4]].question)
            (radioGroup5.getChildAt(0) as RadioButton).setText(reponseListe[0].repons)
            val state9:  Int = reponseListe[0].state
            (radioGroup5.getChildAt(1) as RadioButton).setText(reponseListe[1].repons)
            val state10:  Int = reponseListe[1].state
            radioButton9.setOnClickListener(object : View.OnClickListener{
                override fun onClick(v: View?) {
                    if(state9 == 1){
                        var4=0
                        var4++
                    }else{
                        var4 = 0
                    }
                }
            })
            radioButton10.setOnClickListener(object : View.OnClickListener{
                override fun onClick(v: View?) {
                    if(state10 == 1){
                        var4=0
                        var4++
                    }else{
                        var4 = 0
                    }
                }
            })

            reponseListe = db!!.readData(questionListe[randomList[5]].question)
            (radioGroup6.getChildAt(0) as RadioButton).setText(reponseListe[0].repons)
            val state11:  Int = reponseListe[0].state
            (radioGroup6.getChildAt(1) as RadioButton).setText(reponseListe[1].repons)
            val state12:  Int = reponseListe[1].state
            radioButton11.setOnClickListener(object : View.OnClickListener{
                override fun onClick(v: View?) {
                    if(state11 == 1){
                        var5=0
                        var5++
                    }else{
                        var5 = 0
                    }
                }
            })
            radioButton12.setOnClickListener(object : View.OnClickListener{
                override fun onClick(v: View?) {
                    if(state12 == 1){
                        var5=0
                        var5++
                    }else{
                        var5 = 0
                    }
                }
            })

            reponseListe = db!!.readData(questionListe[randomList[6]].question)
            (radioGroup7.getChildAt(0) as RadioButton).setText(reponseListe[0].repons)
            val state13:  Int = reponseListe[0].state
            (radioGroup7.getChildAt(1) as RadioButton).setText(reponseListe[1].repons)
            val state14:  Int = reponseListe[1].state
            radioButton13.setOnClickListener(object : View.OnClickListener{
                override fun onClick(v: View?) {
                    if(state13 == 1){
                        var7=0
                        var7++
                    }else{
                        var7 = 0
                    }
                }
            })
            radioButton14.setOnClickListener(object : View.OnClickListener{
                override fun onClick(v: View?) {
                    if(state14 == 1){
                        var7=0
                        var7++
                    }else{
                        var7 = 0
                    }
                }
            })
            textView2.setText(definition)
            imageView.setImageResource(source as Int)

            verify_result_button = view?.findViewById(R.id.buttonV)!!
            verify_result_button.setOnClickListener(object : View.OnClickListener{
                override fun onClick(v: View?) {

                    if(var1==0){
                        textviewQ1.setTextColor(Color.parseColor("#000000"))
                        textviewQ1.setBackgroundColor(Color.parseColor("#F20000"))
                    }else{
                        textviewQ1.setTextColor(Color.parseColor("#000000"))
                        textviewQ1.setBackgroundColor(Color.parseColor("#43CF16"))
                    }
                    if(var2==0){
                        textviewQ2.setTextColor(Color.parseColor("#000000"))
                        textviewQ2.setBackgroundColor(Color.parseColor("#F20000"))
                    }else{
                        textviewQ2.setTextColor(Color.parseColor("#000000"))
                        textviewQ2.setBackgroundColor(Color.parseColor("#43CF16"))
                    }
                    if(var3==0){
                        textviewQ3.setTextColor(Color.parseColor("#000000"))
                        textviewQ3.setBackgroundColor(Color.parseColor("#F20000"))
                    }else{
                        textviewQ3.setTextColor(Color.parseColor("#000000"))
                        textviewQ3.setBackgroundColor(Color.parseColor("#43CF16"))
                    }
                    if(var4==0){
                        textviewQ5.setTextColor(Color.parseColor("#000000"))
                        textviewQ5.setBackgroundColor(Color.parseColor("#F20000"))
                    }else{
                        textviewQ5.setTextColor(Color.parseColor("#000000"))
                        textviewQ5.setBackgroundColor(Color.parseColor("#43CF16"))
                    }
                    if(var5==0){
                        textviewQ6.setTextColor(Color.parseColor("#000000"))
                        textviewQ6.setBackgroundColor(Color.parseColor("#F20000"))
                    }else{
                        textviewQ6.setTextColor(Color.parseColor("#000000"))
                        textviewQ6.setBackgroundColor(Color.parseColor("#43CF16"))
                    }
                    if(var6==0){
                        textviewQ4.setTextColor(Color.parseColor("#000000"))
                        textviewQ4.setBackgroundColor(Color.parseColor("#F20000"))
                    }else{
                        textviewQ4.setTextColor(Color.parseColor("#000000"))
                        textviewQ4.setBackgroundColor(Color.parseColor("#43CF16"))
                    }
                    if(var7==0){
                        textviewQ7.setTextColor(Color.parseColor("#000000"))
                        textviewQ7.setBackgroundColor(Color.parseColor("#F20000"))
                    }else{
                        textviewQ7.setTextColor(Color.parseColor("#000000"))
                        textviewQ7.setBackgroundColor(Color.parseColor("#43CF16"))
                    }

                }
            })

            generate_result_button = view?.findViewById(R.id.button)!!
            generate_result_button.setOnClickListener(object : View.OnClickListener{
                override fun onClick(v: View?) {
                    score =var1+var2+var3+var4+var5+var6+var7

                        val intent = Intent(v?.context, ScoreActivity::class.java)
                        val bundle = Bundle()
                        bundle.putInt("score", score)
                        intent.putExtras(bundle)
                        startActivity(intent)


                }
            })

        }
    }

}