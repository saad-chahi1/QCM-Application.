package com.example.qcmtest
import com.example.qcmtest.R

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.recyclerview.FragA
import com.example.recyclerview.FragB
import com.example.tachen3_final.DataBaseHandler

class MainActivity : AppCompatActivity() {
    var db = DataBaseHandler(this)
    var reponse = ArrayList<Reponse>()
    var test = ArrayList<Test>()
    var question = ArrayList<Question>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.configureAndShowMainFragment()
        this.configureAndShowDetailFragment()

        //Test1
        //add Questions
        question.add(Question("Peut-on faire coexister du code écrit en Java ET en Kotlin dans un même projet ?", "Test 1"))
        question.add(Question("Le modificateur de visibilité public est-il obligatoire devant le mot-clé class ?", "Test 1"))
        question.add(Question("Un fichier layout permet :", "Test 1"))
        question.add(Question("L’élément graphique à utiliser pour afficher du texte dans un layout est :", "Test 1"))
        question.add(Question("L’attribut XML à utiliser pour ajouter de l’espace autour d’un élément graphique (et non à l’intérieur) est :", "Test 1"))
        question.add(Question("Comment s’appelle la méthode permettant de référencer un élément graphique dans le code :", "Test 1"))
        question.add(Question("Quelle est la méthode permettant d’intercepter le clic de l’utilisateur sur un bouton ?", "Test 1"))
        question.add(Question("Comment s’appelle la classe Android qui centralise l’ensemble des identifiants de toutes les ressources du projet ?", "Test 1"))

        //add Reponses
        reponse.add(Reponse("Oui, tout à fait, Kotlin est 100% interopérable avec Java.","Peut-on faire coexister du code écrit en Java ET en Kotlin dans un même projet ?",1))
        reponse.add(Reponse("Malheureusement non... Un projet ne pourra être codé qu'en Kotlin ou qu'en Java, car ils ne sont pas interopérables.","Peut-on faire coexister du code écrit en Java ET en Kotlin dans un même projet ?",0))

        reponse.add(Reponse("Oui, cela est obligatoire, sinon le compilateur lèvera une erreur.","Le modificateur de visibilité public est-il obligatoire devant le mot-clé class ?",0))
        reponse.add(Reponse("Non, cela n'est pas obligatoire.","Le modificateur de visibilité public est-il obligatoire devant le mot-clé class ?",1))

        reponse.add(Reponse("D'organiser l'affichage des différents éléments graphiques qui seront présentés à l'utilisateur","Un fichier layout permet :",1))
        reponse.add(Reponse("De configurer le nom de l'application","Un fichier layout permet :",0))

        reponse.add(Reponse("TextField","L’élément graphique à utiliser pour afficher du texte dans un layout est :",0))
        reponse.add(Reponse("TextView","L’élément graphique à utiliser pour afficher du texte dans un layout est :",1))

        reponse.add(Reponse("layout_margin","L’attribut XML à utiliser pour ajouter de l’espace autour d’un élément graphique (et non à l’intérieur) est :",1))
        reponse.add(Reponse("layout_width","L’attribut XML à utiliser pour ajouter de l’espace autour d’un élément graphique (et non à l’intérieur) est :",0))

        reponse.add(Reponse("getElementById()","Comment s’appelle la méthode permettant de référencer un élément graphique dans le code :",0))
        reponse.add(Reponse("findViewById()","Comment s’appelle la méthode permettant de référencer un élément graphique dans le code :",1))

        reponse.add(Reponse("setOnClickListener()","Quelle est la méthode permettant d’intercepter le clic de l’utilisateur sur un bouton ?",1))
        reponse.add(Reponse("setListener()","Quelle est la méthode permettant d’intercepter le clic de l’utilisateur sur un bouton ?",0))

        reponse.add(Reponse("La classe GlobalResources","Comment s’appelle la classe Android qui centralise l’ensemble des identifiants de toutes les ressources du projet ?",0))
        reponse.add(Reponse("La classe R","Comment s’appelle la classe Android qui centralise l’ensemble des identifiants de toutes les ressources du projet ?",1))

        reponse.add(Reponse("une classe kotlin utilisée pour insérer les données dans Sqlite.","Toast :",0))
        reponse.add(Reponse("un message pop-up qui apparaît pendant une courte période.","Toast :",1))

        //Test2
        //add Questions
        question.add(Question("Quel est la différence entre une liste de type  List  et une liste de type  MutableList?", "Test 2"))
        question.add(Question("RelativeLayout :", "Test 2"))
        question.add(Question("LinearLayout :", "Test 2"))
        question.add(Question("TableLayout :", "Test 2"))
        question.add(Question("Un Adaptateur :", "Test 2"))
        question.add(Question("lorsque la source des données est un tableau :", "Test 2"))
        question.add(Question("lorsque les données sont issues d’un cursor :", "Test 2"))
        question.add(Question("choisissez la bon réponse :", "Test 2"))

        //add Reponses
        reponse.add(Reponse("Le type  List  permet de définir une liste d’éléments ordonnée et immuable alors que le type  MutableList  permet de définir une liste d’éléments ordonnée et muable.","Quel est la différence entre une liste de type  List  et une liste de type  MutableList?",1))
        reponse.add(Reponse("Aucune. Les deux types sont utilisés pour des soucis de compatibilités avec la JVM.","Quel est la différence entre une liste de type  List  et une liste de type  MutableList?",0))

        reponse.add(Reponse("est un ViewGroup qui organise les View enfant dans une seule direction.","RelativeLayout :",0))
        reponse.add(Reponse("est un ViewGroup qui affiche des View enfants dans des positions relatives.","RelativeLayout :",1))

        reponse.add(Reponse("est un ViewGroup qui organise les View enfant dans une seule direction","LinearLayout :",1))
        reponse.add(Reponse("est un ViewGroup qui affiche des View enfants dans des positions relatives.","LinearLayout :",0))

        reponse.add(Reponse("est un ViewGroup qui organise les View enfant dans une seule direction","TableLayout :",0))
        reponse.add(Reponse("organise les View qu'il contient sous forme de tables. Plus précisément, TableLayout est un ViewGroup contenant un ou plusieurs TableRow","TableLayout :",1))

        reponse.add(Reponse("un objet adaptateur agit comme un pont entre vue et les données sous-jacentes de cette vue.","Un Adaptateur :",1))
        reponse.add(Reponse("Un objet adaptateur permet de transférer les données d'une activité à autre.","Un Adaptateur :",0))

        reponse.add(Reponse("En utilisant Adapter","lorsque la source des données est un tableau :",0))
        reponse.add(Reponse("En utilisant ArrayAdapter","lorsque la source des données est un tableau :",1))

        reponse.add(Reponse("En utilisant SimpleCursorAdapter","lorsque les données sont issues d’un cursor :",1))
        reponse.add(Reponse("En utilisant CursorAdapter","lorsque les données sont issues d’un cursor :",0))

        reponse.add(Reponse("Le contenu d’une ListView peut être défini de façon statique par l’utilisation de la méthode PileList().","choisissez la bon réponse :",0))
        reponse.add(Reponse("Le contenu d’une ListView défini de façon statique par la propriété android:entries dans le fichier xml.","choisissez la bon réponse :",1))

        //Test3
        //add Questions
        question.add(Question("Quelle méthode permet de démarrer une nouvelle activité ? :", "Test 3"))
        question.add(Question("Quelle classe permet de préciser les paramètres d’une nouvelle activité à créer ?", "Test 3"))
        question.add(Question("Quelle classe Android permet d’afficher à l’utilisateur un message éphémère en bas de l’écran :", "Test 3"))
        question.add(Question("intent :", "Test 3"))
        question.add(Question("Un Adaptateur :", "Test 3"))
        question.add(Question("lorsque la source des données est un tableau :", "Test 3"))
        question.add(Question("lorsque les données sont issues d’un cursor :", "Test 3"))
        question.add(Question("choisissez la bon réponse :", "Test 3"))

        //add Reponses
        reponse.add(Reponse("startActivity().","Quelle méthode permet de démarrer une nouvelle activité ? :",1))
        reponse.add(Reponse("launchActivity().","Quelle méthode permet de démarrer une nouvelle activité ? :",0))

        reponse.add(Reponse("ActivityLayout.","Quelle classe permet de préciser les paramètres d’une nouvelle activité à créer ?",0))
        reponse.add(Reponse("Intent.","Quelle classe permet de préciser les paramètres d’une nouvelle activité à créer ?",1))

        reponse.add(Reponse("La classe Toast.","Quelle classe Android permet d’afficher à l’utilisateur un message éphémère en bas de l’écran :",1))
        reponse.add(Reponse("La classe Message.","Quelle classe Android permet d’afficher à l’utilisateur un message éphémère en bas de l’écran :",0))

        reponse.add(Reponse("un objet agit comme un pont entre vue et les données sous-jacentes de cette vue.","intent :",0))
        reponse.add(Reponse("un pont entre les activités.","intent :",1))

        reponse.add(Reponse("un objet adaptateur agit comme un pont entre vue et les données sous-jacentes de cette vue.","Un Adaptateur :",1))
        reponse.add(Reponse("Un objet adaptateur permet de transférer les données d'une activité à autre.","Un Adaptateur :",0))

        reponse.add(Reponse("En utilisant Adapter","lorsque la source des données est un tableau :",0))
        reponse.add(Reponse("En utilisant ArrayAdapter","lorsque la source des données est un tableau :",1))

        reponse.add(Reponse("En utilisant SimpleCursorAdapter","lorsque les données sont issues d’un cursor :",1))
        reponse.add(Reponse("En utilisant CursorAdapter","lorsque les données sont issues d’un cursor :",0))

        reponse.add(Reponse("Le contenu d’une ListView peut être défini de façon statique par l’utilisation de la méthode PileList().","choisissez la bon réponse :",0))
        reponse.add(Reponse("Le contenu d’une ListView défini de façon statique par la propriété android:entries dans le fichier xml.","choisissez la bon réponse :",1))

        //Test4
        //add Questions
        question.add(Question("Si application est en cours d’exécution, activité ne l’est pas ?", "Test 4"))
        question.add(Question("Lors du démarrage d’une activité, quelles sont les méthodes appelées ?", "Test 4"))
        question.add(Question("Lorsque l’on quitte l’activité quelles sont les méthodes appelées ?", "Test 4"))
        question.add(Question("Quelle est la différence entre les méthodes onCreate() et onStart() ?", "Test 4"))
        question.add(Question("Quand l’activité est détruite, quelle méthode sera appelée ?", "Test 4"))
        question.add(Question("Quelle est la différence entre les méthodes onPause() et onStop() ?", "Test 4"))
        question.add(Question("Bundle ?", "Test 4"))
        question.add(Question("hasExtra() ?", "Test 4"))

        //add Reponses
        reponse.add(Reponse("Vrai.","Si application est en cours d’exécution, activité ne l’est pas ?",1))
        reponse.add(Reponse("Faux.","Si application est en cours d’exécution, activité ne l’est pas ?",0))

        reponse.add(Reponse("« OnPause », « onStop » et « onDestroy ».","Lors du démarrage d’une activité, quelles sont les méthodes appelées ?",0))
        reponse.add(Reponse("« onCreate », « onStart » et « onResume ».","Lors du démarrage d’une activité, quelles sont les méthodes appelées ?",1))

        reponse.add(Reponse("« onPause », « onStop » et « onDestroy ».","Lorsque l’on quitte l’activité quelles sont les méthodes appelées ?",1))
        reponse.add(Reponse("« onCreate », « onStart » et « onResume ».","Lorsque l’on quitte l’activité quelles sont les méthodes appelées ?",0))

        reponse.add(Reponse("onStart() est appelée chaque fois que l’activité commence et onCreate() initialise le layout.","Quelle est la différence entre les méthodes onCreate() et onStart() ?",0))
        reponse.add(Reponse("onStart() est appelée chaque fois que l’activité commence et onCreate() configure l’objet d’activité et charger les ressources statiques.","Quelle est la différence entre les méthodes onCreate() et onStart() ?",1))

        reponse.add(Reponse("onSaveInstanceState.","Quand l’activité est détruite, quelle méthode sera appelée ?",1))
        reponse.add(Reponse("onCreate.","Quand l’activité est détruite, quelle méthode sera appelée ?",0))

        reponse.add(Reponse("Lorsque onStop() est appelée, l’activité est visible à l’écran et pour onPause() activité n'est plus visible.","Quelle est la différence entre les méthodes onPause() et onStop() ?",0))
        reponse.add(Reponse("Lorsque onStop() est appelée, l’activité n’est plus visible à l’écran et pour onPause() activité est encore partiellement visible.","Quelle est la différence entre les méthodes onPause() et onStop() ?",1))

        reponse.add(Reponse("Pour vérifier si l'intention contient des données sur la clé.","hasExtra() ?",1))
        reponse.add(Reponse("Pour Transmettre les données","hasExtra() ?",0))

        reponse.add(Reponse("un objet agit comme un pont entre vue et les données sous-jacentes de cette vue.","Bundle ?",0))
        reponse.add(Reponse("Généralement utilisé pour transmettre des données entre diverses activités d’android.","Bundle ?",1))

        //Test5
        //add Questions
        question.add(Question("Pour définir des fragments dynamiquement, quelle méthode on le fait appel ?", "Test 5"))
        question.add(Question("Comme principe de conception, deux fragments ne doivent JAMAIS communiquer directement.", "Test 5"))
        question.add(Question("Quelle est le rôle de onCreateView () ?", "Test 5"))
        question.add(Question("Quelle méthode est appelé lorsque le fragment inactif est déconnecté de l’activité ?", "Test 5"))
        question.add(Question("Qui va passer lorsque on utilise replace() to pour remplacer Fragment ?", "Test 5"))
        question.add(Question("Les fragments se comportent comme des threads indépendants ?", "Test 5"))
        question.add(Question("Quelle méthode est appelé lorsque le fragment a été connecté à l’activité hôte ?", "Test 5"))
        question.add(Question("hasExtra() ?", "Test 5"))

        //add Reponses
        reponse.add(Reponse("FragmentManager.","Pour définir des fragments dynamiquement, quelle méthode on le fait appel ?",1))
        reponse.add(Reponse("onCreate.","Pour définir des fragments dynamiquement, quelle méthode on le fait appel ?",0))

        reponse.add(Reponse("Faux.","Comme principe de conception, deux fragments ne doivent JAMAIS communiquer directement.",0))
        reponse.add(Reponse("Vrai.","Comme principe de conception, deux fragments ne doivent JAMAIS communiquer directement.",1))

        reponse.add(Reponse("Appelé pour créer la hiérarchie de vues représentant le fragment.","Quelle est le rôle de onCreateView () ?",1))
        reponse.add(Reponse("Utilisée pour initialiser les composants non visuels nécessaires au fragment.","Quelle est le rôle de onCreateView () ?",0))

        reponse.add(Reponse("onAttach().","Quelle méthode est appelé lorsque le fragment inactif est déconnecté de l’activité ?",0))
        reponse.add(Reponse("onDetach().","Quelle méthode est appelé lorsque le fragment inactif est déconnecté de l’activité ?",1))

        reponse.add(Reponse("Le nouveau Fragment remplit le conteneur et L’ancien fragment est détruit.","Qui va passer lorsque on utilise replace() to pour remplacer Fragment ?",1))
        reponse.add(Reponse("Le contenu de l’ancien fragment sera écrase.","Qui va passer lorsque on utilise replace() to pour remplacer Fragment ?",0))

        reponse.add(Reponse("Faux.","Les fragments se comportent comme des threads indépendants ?",0))
        reponse.add(Reponse("Vrai.","Les fragments se comportent comme des threads indépendants ?",1))

        reponse.add(Reponse("Pour vérifier si l’intention contient des données sur la clé.","hasExtra() ?",1))
        reponse.add(Reponse("Pour Transmettre les données","hasExtra() ?",0))

        reponse.add(Reponse("onDetach().","Quelle méthode est appelé lorsque le fragment a été connecté à l’activité hôte ?",0))
        reponse.add(Reponse("onAttach().","Quelle méthode est appelé lorsque le fragment a été connecté à l’activité hôte ?",1))

        //Test6
        //add Questions
        question.add(Question("Le stockage interne est toujours accessible ?", "Test 6"))
        question.add(Question("Le stockage externe est toujours accessible ?", "Test 6"))
        question.add(Question("Quelle est la différence entre la classe SharedPreferences et Maps Kotlin ?", "Test 6"))
        question.add(Question("GetPreferences() Appelé à partir de l’activité lorsque vous souhaitez créer plusieurs fichiers de préférences, chacun avec un nom unique.", "Test 6"))
        question.add(Question("GetSharedPreferences () Appelé à partir de l’activité lorsque vous souhaitez créer plusieurs fichiers de préférences, chacun avec un nom unique.", "Test 6"))
        question.add(Question("MODE_PRIVATE est :", "Test 6"))
        question.add(Question("MODE_APPEND est :", "Test 6"))
        question.add(Question("La Carte SD est une stockage :", "Test 6"))

        //add Reponses
        reponse.add(Reponse("Vrai.","Le stockage interne est toujours accessible ?",1))
        reponse.add(Reponse("Faux.","Le stockage interne est toujours accessible ?",0))

        reponse.add(Reponse("Faux.","Le stockage externe est toujours accessible ?",1))
        reponse.add(Reponse("Vrai.","Le stockage externe est toujours accessible ?",0))

        reponse.add(Reponse("SharedPreferences sont permanents pas comme les maps.","Quelle est la différence entre la classe SharedPreferences et Maps Kotlin ?",1))
        reponse.add(Reponse("Ils sont pareils.","Quelle est la différence entre la classe SharedPreferences et Maps Kotlin ?",0))

        reponse.add(Reponse("Faux.","GetPreferences() Appelé à partir de l’activité lorsque vous souhaitez créer plusieurs fichiers de préférences, chacun avec un nom unique.",0))
        reponse.add(Reponse("Vrai.","GetPreferences() Appelé à partir de l’activité lorsque vous souhaitez créer plusieurs fichiers de préférences, chacun avec un nom unique.",1))

        reponse.add(Reponse("Vrai.","GetSharedPreferences () Appelé à partir de l’activité lorsque vous souhaitez créer plusieurs fichiers de préférences, chacun avec un nom unique.",1))
        reponse.add(Reponse("Faux.","GetSharedPreferences () Appelé à partir de l’activité lorsque vous souhaitez créer plusieurs fichiers de préférences, chacun avec un nom unique.",0))

        reponse.add(Reponse("Mode d’accés au Galerie.","MODE_PRIVATE est :",0))
        reponse.add(Reponse("Mode de création de fichier par défaut, où le fichier créé n’est accessible que par l’application appelante.","MODE_PRIVATE est :",1))

        reponse.add(Reponse("Externe.","La Carte SD est une stockage :",1))
        reponse.add(Reponse("Interne.","La Carte SD est une stockage :",0))

        reponse.add(Reponse("Le fichier peut être écrit par n’importe quelle application.","MODE_APPEND est :",0))
        reponse.add(Reponse("Ajoutera les nouvelles préférences avec les préférences déjà existantes.","MODE_APPEND est :",1))

        //Test7
        //add Questions
        question.add(Question("Quelle est le rôle de getCount() ?", "Test 7"))
        question.add(Question("De manière générale, où les bases de données sont stockées ?", "Test 7"))
        question.add(Question("Les bases ne sont accessibles qu’au sein de l’application elle-même ?", "Test 7"))
        question.add(Question("A quoi sert la commande void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) ?", "Test 7"))
        question.add(Question("Quelle est la différence entre MySQL et SQLite ?", "Test 7"))
        question.add(Question("Comme n’importe quel adaptateur, un CursorAdapter fera la transition entre des données et un AdapterView ?", "Test 7"))
        question.add(Question("MODE_WORLD_WRITABLE est :", "Test 7"))
        question.add(Question("Quelle Mode permet de créer (ou de remplacer, d’ailleurs) un fichier qui sera utilisé uniquement par l’application ?", "Test 7"))

        //add Reponses
        reponse.add(Reponse("Permet d’obtenir le nombre d’enregistrements de la requête.","Quelle est le rôle de getCount() ?",1))
        reponse.add(Reponse("Permet d’obtenir le nombre de tables dans une database.","Quelle est le rôle de getCount() ?",0))

        reponse.add(Reponse("Dans les répertoires de la forme /data/data/<package>/databases.","De manière générale, où les bases de données sont stockées ?",1))
        reponse.add(Reponse("Dans les répertoires de la forme /cache/data/<package>/databases.","De manière générale, où les bases de données sont stockées ?",0))

        reponse.add(Reponse("Vrai.","Les bases ne sont accessibles qu’au sein de l’application elle-même ?",1))
        reponse.add(Reponse("Faux.","Les bases ne sont accessibles qu’au sein de l’application elle-même ?",0))

        reponse.add(Reponse("Faire une mise à jour à la table d'une base de données.","A quoi sert la commande void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) ?",0))
        reponse.add(Reponse("Faire une mise à jour au base données.","A quoi sert la commande void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) ?",1))

        reponse.add(Reponse("Contrairement à MySQL, SQLite ne nécessite pas de serveur pour fonctionner.","Quelle est la différence entre MySQL et SQLite ?",1))
        reponse.add(Reponse("Ils sont pareils.","Quelle est la différence entre MySQL et SQLite ?",0))

        reponse.add(Reponse("Faux.","Comme n’importe quel adaptateur, un CursorAdapter fera la transition entre des données et un AdapterView ?",0))
        reponse.add(Reponse("Vrai.","Comme n’importe quel adaptateur, un CursorAdapter fera la transition entre des données et un AdapterView ?",1))

        reponse.add(Reponse("MODE_PRIVATE.","Quelle Mode permet de créer (ou de remplacer, d’ailleurs) un fichier qui sera utilisé uniquement par l’application ?",1))
        reponse.add(Reponse("MODE_WORLD_READABLE.","Quelle Mode permet de créer (ou de remplacer, d’ailleurs) un fichier qui sera utilisé uniquement par l’application ?",0))

        reponse.add(Reponse("Le fichier peut être lu par n'importe quellee application.","MODE_WORLD_WRITABLE est :",0))
        reponse.add(Reponse("Le fichier peut être écrit par n'importe quelle application.","MODE_WORLD_WRITABLE est :",1))


        for(ques in question){
            db.add_question(ques)
        }

        for(rep in reponse){
            db.add_reponse(rep)
        }
    }

    private var detailFragment: FragB? = null
    private fun configureAndShowDetailFragment() {
        detailFragment = supportFragmentManager.findFragmentById(R.id.fragment_container2) as FragB?

        //A - We only add DetailFragment in Tablet mode (If found frame_layout_detail)
        if (detailFragment == null && findViewById<View?>(R.id.fragment_container2) != null) {
            detailFragment = FragB()
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container2, detailFragment!!)
                .commit()
        }
    }

    private var mainFragment: FragA? = null
    private fun configureAndShowMainFragment() {
        // A - Get FragmentManager (Support) and Try to find existing instance of fragment in FrameLayout container
        mainFragment = supportFragmentManager.findFragmentById(R.id.fragment_container) as FragA?
        if (mainFragment == null) {
            // B - Create new main fragment
            mainFragment = FragA()
            // C - Add it to FrameLayout container
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, mainFragment!!)
                .commit()
        }
    }
}