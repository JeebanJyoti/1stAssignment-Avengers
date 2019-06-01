package com.example.avengers

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class Main2Activity : AppCompatActivity() {

    val avengers= arrayOf("Thor","Captain America","Black Widow","Iron Man","Hulk",
        "Hawkeye","Captain Marvel","War Machine","Ant Man","Spider Man","Dr. Strange",
        "Black Panther","Scarlett Witch","Vision","Thanos","Nebula")
    val realname= arrayOf("Chris Hemsworth","Chris Evans","Scarlett Johansson","Robert Downey Jr.",
        "Mark Ruffalo","Jeremy Renner","Brie Larson","Don Cheadle","Paul Rudd","Tom Holland","Benedict Cumberbatch","" +
                "Chadwick Aaron Boseman","Elizabeth Olsen","Paul Bettany","Josh Brolin","Karen Gillan")
    val url=arrayOf("http://rockchalkblog.com/wp-content/uploads/2013/10/thors-hammer-and-mighty-thor.jpg",
        "https://assets1.ignimgs.com/2019/04/24/captainamerica-blogroll-1556138355442_1280w.jpg",
        "https://cdn.images.express.co.uk/img/dynamic/36/590x/Black-Widow-movie-Scarlett-Johansson-set-for-record-pay-day-907215.jpg",
        "https://pbs.twimg.com/media/C5g3WVKUsAEWsWz.jpg",
        "https://cdn.vox-cdn.com/thumbor/513EibMf4LscNq34noXEt_qG1dU=/0x0:2048x858/1200x800/filters:focal(682x242:1008x568)/cdn.vox-cdn.com/uploads/chorus_image/image/63325419/3f18412f_4bbb_433d_82f4_4c50208b2531_brb1740_trbcomp_v4111171.0.jpg",
        "https://i.pinimg.com/originals/10/54/7c/10547c9aa47de44adb8f8fdcf95613cd.jpg",
        "https://www.slugmag.com/wp/wp-content/uploads/2019/04/captain-marvel.jpg",
        "https://i.pinimg.com/originals/9a/3f/3d/9a3f3d80e6b8c4ba96c39e6811cd870e.jpg",
        "https://images-na.ssl-images-amazon.com/images/I/91hDmJKBdSL._RI_.jpg",
        "https://icdn2.digitaltrends.com/image/spiderman-far-from-home-poster-2-720x720.jpg",
        "https://i.gadgets360cdn.com/large/Doctor_Strange_review_2016_Marvel_Benedict_Cumberbatch_1478164719257.jpeg",
        "https://www.thewrap.com/wp-content/uploads/2018/02/the-black-panther-film-marvel.jpg",
        "https://nerdist.com/wp-content/uploads/2019/01/Scarlet-Witch.jpg",
        "https://media1.popsugar-assets.com/files/thumbor/Bg_s_NeOcPHKSHhgO7Eb8lj_ens/fit-in/2048xorig/filters:format_auto-!!-:strip_icc-!!-/2015/04/28/933/n/1922398/7e4f41b9_av32.JPG",
        "https://cdn.images.express.co.uk/img/dynamic/36/750x445/1107669.jpg",
        "https://media.comicbook.com/2019/05/avengers-endgame-nebula-karen-gillan-doctor-who-amy-pond-1170547-1280x0.jpeg")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val image=findViewById<ImageView>(R.id.image)
        val tv1=findViewById<TextView>(R.id.tv1)
        val tv2=findViewById<TextView>(R.id.tv2)
        val tv3=findViewById<TextView>(R.id.tv3)
        val back=findViewById<Button>(R.id.back)
        val name:String=intent.getStringExtra("listviewclickvalue")

        val c:Int=getRealname(name)

        Glide.with(this).load(url[c]).into(image)
        tv1.setText("NAME : "+name)
        tv2.setText("REAL NAME : "+realname[c])

        if (name.equals("Thor")){
            tv3.setText("Thor is a 2011 American superhero film based on the Marvel Comics character of the same name, produced by Marvel Studios and distributed by Paramount Pictures. It is the fourth film in the Marvel Cinematic Universe (MCU).")
        }
        else if (name.equals("Captain America")){
            tv3.setText("Captain America is a fictional superhero appearing in American comic books published by Marvel Comics. Created by cartoonists Joe Simon and Jack Kirby, the character first appeared in Captain America Comics #1 (cover dated March 1941) from Timely Comics, a predecessor of Marvel Comics. Captain America was designed as a patriotic supersoldier who often fought the Axis powers of World War II and was Timely Comics' most popular character during the wartime period. The popularity of superheroes waned following the war and the Captain America comic book was discontinued in 1950, with a short-lived revival in 1953. Since Marvel Comics revived the character in 1964, Captain America has remained in publication.")
        }
        else if (name.equals("Black Widow")){
            tv3.setText("Natasha Romanoff also known as Black Widow is a fictional superhero appearing in American comic books published by Marvel Comics. Created by editor and plotter Stan Lee, scripter Don Rico, and artist Don Heck, the character debuted in Tales of Suspense #52 (April 1964). The character was introduced as a Russian spy, an antagonist of the superhero Iron Man. She later defected to the United States, becoming an agent of the fictional spy agency S.H.I.E.L.D., and a member of the superhero team the Avengers.")
        }
        else if (name.equals("Iron Man")){
            tv3.setText("Iron Man is a 2008 American superhero film based on the Marvel Comics character of the same name. The first installment of the Marvel Cinematic Universe, it was directed by Jon Favreau from a screenplay by Mark Fergus and Hawk Ostby, and Art Marcum and Matt Holloway. The film follows Tony Stark (Robert Downey Jr.), an industrialist and master engineer who builds a powered exoskeleton after a life-threatening incident, and becomes the technologically advanced superhero Iron Man.")
        }
        else if (name.equals("Hulk")){
            tv3.setText("The Hulk is a fictional superhero appearing in publications by the American publisher Marvel Comics. Created by writer Stan Lee and artist Jack Kirby, the character first appeared in the debut issue of The Incredible Hulk (May 1962). In his comic book appearances, the character is both the Hulk, a green-skinned, hulking and muscular humanoid possessing a vast degree of physical strength, and his alter ego Dr. Robert Bruce Banner, a physically weak, socially withdrawn, and emotionally reserved physicist, the two existing as independent personalities and resenting of the other.")
        }
        else if (name.equals("Hawkeye")){
            tv3.setText("Hawkeye (Clinton Francis \"Clint\" Barton) is a fictional superhero appearing in American comic books published by Marvel Comics. Created by writer Stan Lee and artist Don Heck, the character first appeared as a villain in Tales of Suspense #57 (Sept. 1964) and later joined the Avengers in The Avengers #16 (May 1965). He has been a prominent member of the team ever since. He was also ranked at #44 on IGN's Top 100 Comic Book Heroes list.[3]")
        }
        else if (name.equals("Captain Marvel")){
            tv3.setText("Captain Marvel is a 2019 American superhero film based on the Marvel Comics character Carol Danvers. Produced by Marvel Studios and distributed by Walt Disney Studios Motion Pictures, it is the twenty-first film in the Marvel Cinematic Universe (MCU). The film is written and directed by Anna Boden and Ryan Fleck, with Geneva Robertson-Dworet also contributing to the screenplay. Brie Larson stars as Danvers, alongside Samuel L. Jackson, Ben Mendelsohn, Djimon Hounsou, Lee Pace, Lashana Lynch, Gemma Chan, Annette Bening, Clark Gregg, and Jude Law. Set in 1995, the story follows Danvers as she becomes Captain Marvel after Earth is caught in the center of a galactic conflict between two alien civilizations.")
        }
        else if (name.equals("War Machine")){
            tv3.setText("War Machine (James Rupert \"Rhodey\" Rhodes) is a fictional superhero appearing in American comic books published by Marvel Comics. Jim Rhodes first appeared in Iron Man #118 (January 1979) by David Michelinie and John Byrne. The War Machine armor, which became his signature armored battlesuit, was created by Len Kaminski and Kevin Hopgood.")
        }
        else if (name.equals("Ant Man")){
            tv3.setText("Ant-Man is the name of several fictional superheroes appearing in books published by Marvel Comics. Created by Stan Lee, Larry Lieber and Jack Kirby, Ant-Man's first appearance was in Tales to Astonish #35 (September 1962). The persona was originally the brilliant scientist Hank Pym's superhero alias after inventing a substance that can change size, but Scott Lang and Eric O'Grady also took on the mantle after the original changed his superhero identity to various other aliases, such as Giant-Man, Goliath, and Yellowjacket.")
        }
        else if (name.equals("Spider Man")){
            tv3.setText("Spider-Man is a fictional superhero created by writer-editor Stan Lee and writer-artist Steve Ditko. He first appeared in the anthology comic book Amazing Fantasy #15 (August 1962) in the Silver Age of Comic Books. He appears in American comic books published by Marvel Comics, as well as in a number of movies, television shows, and video game adaptations set in the Marvel Universe. In the stories, Spider-Man is the alias of Peter Parker, an orphan raised by his Aunt May and Uncle Ben in New York City after his parents Richard and Mary Parker were killed in a plane crash. Lee and Ditko had the character deal with the struggles of adolescence and financial issues, and accompanied him with many supporting characters, such as J. Jonah Jameson, Flash Thompson, Harry Osborn, romantic interests Gwen Stacy and Mary Jane Watson, and foes such as Doctor Octopus, Green Goblin and Venom. His origin story has him acquiring spider-related abilities after a bite from a radioactive spider; these include clinging to surfaces, shooting spider-webs from wrist-mounted devices, and detecting danger with his \"spider-sense\".")
        }
        else if (name.equals("Dr. Strange")){
            tv3.setText("Doctor Stephen Strange is a fictional superhero appearing in American comic books published by Marvel Comics. Created by artist Steve Ditko and writer Stan Lee,[1] the character first appeared in Strange Tales #110 (cover-dated July 1963). Doctor Strange serves as the Sorcerer Supreme, the primary protector of Earth against magical and mystical threats. Inspired by stories of black magic and Chandu the Magician, Strange was created during the Silver Age of Comic Books to bring a different kind of character and themes of mysticism to Marvel Comics.")
        }
        else if(name.equals("Black Panther")){
            tv3.setText("Black Panther is a fictional superhero appearing in American comic books published by Marvel Comics. The character was created by writer-editor Stan Lee and writer-artist Jack Kirby, first appearing in Fantastic Four #52 (cover-dated July 1966) in the Silver Age of Comic Books. Black Panther's real name is T'Challa, king and protector of the fictional African nation of Wakanda. Along with possessing enhanced abilities achieved through ancient Wakandan rituals of drinking the essence of the heart-shaped herb, T'Challa also relies on his proficiency in science, rigorous physical training, hand-to-hand combat skills, and access to wealth and advanced Wakandan technology to combat his enemies.")
        }
        else if (name.equals("Scarlett Witch")){
            tv3.setText("Scarlet Witch is a fictional superhero appearing in American comic books published by Marvel Comics. The character was created by writer Stan Lee and artist Jack Kirby, first appearing in The X-Men #4 (March 1964) in the Silver Age of Comic Books. She is first portrayed as a supervillain along with her twin brother Quicksilver as a founding member of the Brotherhood of Mutants. In most depictions she is portrayed as a mutant, a member of a fictional subspecies of humans born with superhuman abilities, and, for much of the character's history, was considered the daughter of the mutant Magneto. Scarlet Witch possesses abilities to alter reality in unspecified ways and is a powerful sorceress. Scarlet Witch is later depicted as a regular member of the Avengers superhero team. She also becomes the wife of fellow superhero and teammate Vision, with whom she has two sons, Thomas and William.")
        }
        else if (name.equals("Vision")){
            tv3.setText("The Vision is a fictional superhero appearing in American comic books published by Marvel Comics. He is an android and a member of the Avengers who first appeared in The Avengers #57 (October 1968). He is loosely based on the Timely Comics character of the same name.")
        }
        else if (name.equals("Thanos")){
            tv3.setText("Thanos is a fictional supervillain appearing in American comic books published by Marvel Comics. The character, created by writer/artist Jim Starlin, first appeared in The Invincible Iron Man #55 (cover dated February 1973). Thanos is one of the most powerful villains in the Marvel Universe and has clashed with many heroes including the Avengers, the Guardians of the Galaxy, the Fantastic Four, and the X-Men.")
        }
        else if (name.equals("Nebula")){
            tv3.setText("Nebula is a fictional character appearing in American comic books published by Marvel Comics. Created by Roger Stern and John Buscema, the character first appeared in The Avengers. Nebula has appeared in various adaptations of the character in other media, including animated television series and video games. Karen Gillan portrays the character in the Marvel Cinematic Universe films Guardians of the Galaxy (2014), Guardians of the Galaxy Vol. 2 (2017), Avengers: Infinity War (2018), and Avengers: Endgame (2019).")
        }

        back.setOnClickListener{
            val intent=Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        }
    }

    fun getRealname(tv1: String):Int {
        var i=0
        for(s in avengers){
            if(tv1==s){
                return i
            }
            i++
        }
        return i
    }
}
