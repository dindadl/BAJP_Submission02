package com.dicoding.picdiploma.movie_1.utils

import com.dicoding.picdiploma.movie_1.R
import com.dicoding.picdiploma.movie_1.entity.MovieEntity
import com.dicoding.picdiploma.movie_1.entity.TvEntity

object DummyData {
    fun generateDummyMovies(): List<MovieEntity> {

        val movies = ArrayList<MovieEntity>()

        movies.add(MovieEntity(
                "m01",
                "A Star Is Born",
                R.drawable.poster_a_start_is_born,
                "Seasoned musician Jackson Maine discovers — " +
                        "and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer " +
                        "— until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down," +
                        " as Jack fights an ongoing battle with his own internal demons.",
                "2018",
                "Drama, Romance, Music",
                "Bradley Cooper, Lady Gaga, Sam Elliott",
                "75/100"))

        movies.add(MovieEntity(
                "m02",
                "Alita: Battle Angel",
                R.drawable.poster_alita,
                "When Alita awakens with no memory of who she is in a future world she does not recognize," +
                        " she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell" +
                        " is the heart and soul of a young woman with an extraordinary past.",
                "2019",
                "Action, Science, Fiction, Adventure",
                "Rosa Salazar, Christoph Waltz, Jennifer Connelly",
                "72/100"))

        movies.add(MovieEntity(
                "m03",
                "Aquaman",
                R.drawable.poster_aquaman,
                "Once home to the most advanced civilization on Earth," +
                        " Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. " +
                        "With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. " +
                        "Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                "2018",
                "Action, Adventure, Fantasy",
                "Jason Momoa, Amber Heard, Willem Dafoe",
                "69/100"))

        movies.add(MovieEntity(
                "m04",
                "Bohemian Rhapsody",
                R.drawable.poster_bohemian,
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. " +
                        "Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, " +
                        "Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                "2018",
                "Drama, History Music",
                "Rami Malek, Gwilym Lee, Ben Hardy",
                "80/100"))

        movies.add(MovieEntity(
                "m05",
                "Cold Pursuit",
                R.drawable.poster_cold_persuit,
                "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. " +
                        "Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, " +
                        "eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, " +
                        "as he proves that revenge is all in the execution.",
                "2019",
                "Action, Crime, Thriller",
                "Liam Neeson, Laura Dern, Emmy Rossum",
                "57/100"))

        movies.add(MovieEntity(
                "m06",
                "Creed II",
                R.drawable.poster_creed,
                "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, " +
                        "Adonis Creed is up against the challenge of his life.",
                "2019",
                "Drama",
                "Michael B. Jordan, Sylvester Stallone, Dolph Lundgren",
                "69/100"))

        movies.add(MovieEntity(
                "m07",
                "Fantastic Beast: The Crimes of Grindelwald",
                R.drawable.poster_crimes,
                "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. " +
                        "However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, " +
                        "his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, " +
                        "even among the truest friends and family, in an increasingly divided wizarding world.",
                "2018",
                "Adventure, Fantasy, Drama",
                "Eddie Redmayne, Katherine Waterston, Alison Sudol",
                "69/100"))

        movies.add(MovieEntity(
                "m08",
                "Glass",
                R.drawable.poster_glass,
                "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, " +
                        "a disturbed man who has twenty-four personalities. " +
                        "Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                "2019",
                "Thriller, Drama, Science Fiction",
                "James McAvoy, Bruce Willis, Anya Taylor-Joy",
                "67/100"))

        movies.add(MovieEntity(
                "m09",
                "How to Train Your Dragon: The Hidden World",
                R.drawable.poster_how_to_train,
                "As Hiccup fulfills his dream of creating a peaceful dragon utopia, " +
                        "Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. " +
                        "When danger mounts at home and Hiccup’s reign as village chief is tested, " +
                        "both dragon and rider must make impossible decisions to save their kind.",
                "2019",
                "Animation, Family, Adventure",
                "Jay Baruchel, America Ferrera, F. Murray Abraham",
                "78/100"))

        movies.add(MovieEntity(
                "m10",
                "Avengers: Infinity War",
                R.drawable.poster_infinity_war,
                "SAs the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, " +
                        "a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, " +
                        "artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - " +
                        "the fate of Earth and existence itself has never been more uncertain.",
                "2018",
                "Adventure, Action, Science Fiction",
                "Robert Downey Jr., Chris Hemsworth, Chris Evans",
                "83/100"))

        movies.add(MovieEntity(
                "m11",
                "Mary Queen of Scots",
                R.drawable.poster_marry_queen,
                "In 1561, Mary Stuart, widow of the King of France, returns to Scotland, " +
                        "reclaims her rightful throne and menaces the future of Queen Elizabeth I as ruler of England, " +
                        "because she has a legitimate claim to the English throne. Betrayals, rebellions, conspiracies and their own life choices imperil both Queens. " +
                        "They experience the bitter cost of power, until their tragic fate is finally fulfilled.",
                "2018",
                "Drama, History",
                "Saoirse Ronan, Margot Robbie, Jack Lowden",
                "66/100"))

        movies.add(MovieEntity(
                "m12",
                "Master Z: Ip Man Legacy",
                R.drawable.poster_master_z,
                "Following his defeat by Master Ip, Cheung Tin Chi tries to make a life with his young son in Hong Kong, " +
                        "waiting tables at a bar that caters to expats. But it's not long before the mix of foreigners, " +
                        "money, and triad leaders draw him once again to the fight.",
                "2018",
                "Action",
                "Zhang Jin, Dave Bautista, Liu Yan",
                "60/100"))

        movies.add(MovieEntity(
                "m13",
                "Mortal Engines",
                R.drawable.poster_mortal_engines,
                "Many thousands of years in the future, " +
                        "Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. " +
                        "On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
                "2018",
                "Adventure, Science Fiction",
                "Hera Hilmar, Robert Sheehan, Hugo Weaving",
                "61/100"))

        movies.add(MovieEntity(
                "m14",
                "Overlord",
                R.drawable.poster_overlord,
                "France, June 1944. On the eve of D-Day, " +
                        "some American paratroopers fall behind enemy lines after their aircraft crashes while on a mission to destroy a radio tower in a small village near the beaches of Normandy. " +
                        "After reaching their target, the surviving paratroopers realise that, in addition to fighting the Nazi troops that patrol the village, they also must fight against something else.",
                "2018",
                "Horror, War, Science Fiction",
                "Mathilde Ollivier, Jovan Adepo, Wyatt Russell",
                "67/100"))

        movies.add(MovieEntity(
                "m15",
                "Serenity",
                R.drawable.poster_serenity,
                "The quiet life of Baker Dill, a fishing boat captain who lives on the isolated Plymouth Island, " +
                        "where he spends his days obsessed with capturing an elusive tuna while fighting his personal demons, " +
                        "is interrupted when someone from his past comes to him searching for help.",
                "2019",
                "Thriller, Mystery, Drama",
                "Matthew McConaughey, Anne Hathaway, Jason Clarke",
                "54/100"))

        return movies
    }

    fun generateDummyTv(): List<TvEntity> {

        val tv = ArrayList<TvEntity>()

        tv.add(TvEntity(
                "t01",
                "Arrow",
                R.drawable.poster_arrow,
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. " +
                        "He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "2012",
                "Crime, Drama, Mystery, Action & Adventure",
                "Stephen Amell, David Ramsey, Emily Bett Rickards",
                "66/100"))

        tv.add(TvEntity(
                "t02",
                "Doom Patrol",
                R.drawable.poster_doom_patrol,
                "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. " +
                        "Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
                "2019",
                "Sci-Fi & Fantasy, Comedy, Drama",
                "Diane Guerrero, April Bowlby, Joivan Wade",
                "76/100"))

        tv.add(TvEntity(
                "t03",
                "Dragon Ball",
                R.drawable.poster_dragon_ball,
                "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. " +
                        "Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, " +
                        "but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the mystical Dragon Balls brought her to Goku's home. " +
                        "Together, they set off to find all seven and to grant her wish.",
                "1986",
                "Animation, Action & Adventure, Sci-Fi & Fantasy",
                "Masako Nozawa, Mayumi Tanaka, Hiromi Tsuru",
                "81/100"))

        tv.add(TvEntity(
                "t04",
                "Fairy Tail",
                R.drawable.poster_fairytail,
                "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. " +
                        "One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. " +
                        "But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.",
                "2009",
                "Action & Adventure, Animation, Comedy, Sci-Fi & Fantasy, Mystery",
                "Yoshimitsu Shimoyama, Eiji Miyashita, Fuyuka Ono",
                "78/100"))

        tv.add(TvEntity(
                "t05",
                "Family Guy",
                R.drawable.poster_family_guy,
                "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. " +
                        "Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), " +
                        "Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). " +
                        "The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                "1999",
                "Animation, Comedy",
                "Seth MacFarlane, Alex Borstein, Seth Green",
                "70/100"))

        tv.add(TvEntity(
                "t06",
                "Flash",
                R.drawable.poster_flash,
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. " +
                        "Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. " +
                        "Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. " +
                        "For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "2014",
                "Drama, Sci-Fi & Fantasy",
                "Grant Gustin, Carlos Valdes, Candice Patton",
                "77/100"))

        tv.add(TvEntity(
                "t07",
                "Game Of Thrones",
                R.drawable.poster_god,
                "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. " +
                        "All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, " +
                        "the Night's Watch, is all that stands between the realms of men and icy horrors beyond.",
                "2011",
                "Sci-Fi & Fantasy, Drama, Action & Adventure",
                "Emilia Clarke, Lena Headey, Sophie Turner",
                "84/100"))

        tv.add(TvEntity(
                "t08",
                "Gotham",
                R.drawable.poster_gotham,
                "Everyone knows the name Commissioner Gordon. " +
                        "He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. " +
                        "But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? " +
                        "What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? " +
                        "And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                "2014",
                "Drama, Crime, Sci-Fi & Fantasy",
                "Ben McKenzie, Donal Logue, David Mazouz",
                "75/100"))

        tv.add(TvEntity(
                "t09",
                "Grey's Anatomy",
                R.drawable.poster_grey_anatomy,
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                "2005",
                "Drama",
                "Ellen Pompeo, James Pickens Jr., Chandra Wilson",
                "82/100"))

        tv.add(TvEntity(
                "t10",
                "Hanna",
                R.drawable.poster_hanna,
                "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. " +
                        "Based on the 2011 Joe Wright film.",
                "2019",
                "Action & Adventure, Drama",
                "Esme Creed-Miles, Mireille Enos, Noah Taylor",
                "75/100"))


        tv.add(TvEntity(
                "t11",
                "Iron Fist",
                R.drawable.poster_iron_fist,
                "Danny Rand resurfaces 15 years after being presumed dead. Now, with the power of the Iron Fist, he seeks to reclaim his past and fulfill his destiny.",
                "2017",
                "Action & Adventure, Drama, Sci-Fi & Fantasy",
                "Finn Jones, Jessica Henwick, Jessica Stroup",
                "66/100"))

        tv.add(TvEntity(
                "t12",
                "Naruto Shippuden",
                R.drawable.poster_naruto_shipudden,
                "Naruto Shippuuden is the continuation of the original animated TV series Naruto." +
                        "The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. " +
                        "After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
                "2007",
                "Animation, Action & Adventure, Sci-Fi & Fantasy",
                "Jouji Nakata, Junko Takeuchi, Chie Nakamura",
                "86/100"))

        tv.add(TvEntity(
                "t13",
                "NCIS",
                R.drawable.poster_ncis,
                "From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.",
                "2003",
                "Crime, Action & Adventure, Drama",
                "Mark Harmon, David McCallum, Sean Murray",
                "74/100"))

        tv.add(TvEntity(
                "t14",
                "Riverdale",
                R.drawable.poster_riverdale,
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, " +
                        "the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                "2017",
                "Mystery, Drama, Crime",
                "K.J. Apa, Lili Reinhart, Cole Sprouse",
                "86/100"))

        tv.add(TvEntity(
                "t15",
                "Shameless",
                R.drawable.poster_shameless,
                "Chicagoan Frank Gallagher is the proud single dad of six smart, industrious, independent kids, who without him would be... perhaps better off. " +
                        "When Frank's not at the bar spending what little money they have, he's passed out on the floor. But the kids have found ways to grow up in spite of him. They may not be like any family you know, " +
                        "but they make no apologies for being exactly who they are.",
                "2011",
                "Drama, Comedy",
                "William H. Macy, Jeremy Allen White, Cameron Monaghan",
                "80/100"))


        return tv

    }

}

