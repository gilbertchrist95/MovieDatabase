package com.jogoler.android.moviedb;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by Gilbert on 7/3/2017.
 */

public class Movie implements Parcelable{



    /**
     * page : 1
     * total_results : 316210
     * total_pages : 15811
     * results : [{"vote_count":1,"id":441580,"video":false,"vote_average":10,"title":"The Jinx: The Life and Deaths of Robert Durst Season 1 Chapter 6: What the Hell Did I Do?","popularity":1,"poster_path":"/9Hj2bqi955SvTa5zj7uZs6sic29.jpg","original_language":"en","original_title":"The Jinx: The Life and Deaths of Robert Durst Season 1 Chapter 6: What the Hell Did I Do?","genre_ids":[99],"backdrop_path":"/3br0Rt90AkaqiwVBZVvVUYD1juQ.jpg","adult":false,"overview":"","release_date":"2015-03-15"},{"vote_count":1,"id":5706,"video":false,"vote_average":10,"title":"Playboy: Voluptuous Vixens II","popularity":1.001755,"poster_path":"/cn6VHdrTtmYxySY0cT0aH6JLUnV.jpg","original_language":"en","original_title":"Playboy: Voluptuous Vixens II","genre_ids":[99],"backdrop_path":null,"adult":false,"overview":"No overview found.","release_date":"1998-07-21"},{"vote_count":1,"id":5676,"video":false,"vote_average":10,"title":"Playboy: Voluptuous Vixens","popularity":1.000213,"poster_path":null,"original_language":"en","original_title":"Playboy: Voluptuous Vixens","genre_ids":[99],"backdrop_path":null,"adult":false,"overview":"No overview found.","release_date":"1997-01-01"},{"vote_count":1,"id":5087,"video":false,"vote_average":10,"title":"Bil'in Habibti","popularity":1.001352,"poster_path":"/xnvfjktcTRM9w6nMZ66sJmT9LhY.jpg","original_language":"en","original_title":"Bil'in Habibti","genre_ids":[99],"backdrop_path":"/uzawjEaOXiiYPhQzKmYmmDqMDfz.jpg","adult":false,"overview":"The Israeli filmmaker Shai Corneli Polak records the building of the 'security wall' through Palestinian territory at the village of Bil'in. The villagers protest mostly peacefully, while the Israeli army doesn't react peacefully. By now the Israeli High Court has ruled that the building of the wall was illegal.","release_date":"2006-01-01"},{"vote_count":1,"id":3152,"video":false,"vote_average":10,"title":"Big Monster on Campus","popularity":1.250164,"poster_path":"/sN8ExJXn8PdqhvKCsg3MMEjQE07.jpg","original_language":"en","original_title":"Big Monster on Campus","genre_ids":[35,27],"backdrop_path":"/tpKGe6XcYYeELxvlhBAAowwA9C5.jpg","adult":false,"overview":"A student receives a serial killer's brain in a transplant after being thrown into a pool with no water in it","release_date":"2000-01-01"},{"vote_count":1,"id":6224,"video":false,"vote_average":10,"title":"Bühne frei für Marika","popularity":1.000175,"poster_path":"/1jtdc1FOrlv9x1wyoE69lir8D8R.jpg","original_language":"de","original_title":"Bühne frei für Marika","genre_ids":[10402,35],"backdrop_path":null,"adult":false,"overview":"A dance and music film tailored completely for Marika Rokk:  After her divorce, the wife of a composer uses her wit and charm to engage Marika as a singer and dancer on the stage.  This manages to give life once again to the extinguished love between her and her former husband.","release_date":"1958-08-14"},{"vote_count":1,"id":6959,"video":false,"vote_average":10,"title":"What Women Dream","popularity":1.020944,"poster_path":"/iD1U2efUvTr6uPMcSeknfR27ZXM.jpg","original_language":"de","original_title":"Was Frauen träumen","genre_ids":[35,9648],"backdrop_path":null,"adult":false,"overview":"In this pre-WWII German mystery-comedy, a lovely kleptomaniac with a taste for fine jewelry is unable to resist temptation. Strangely, every time she steals something, a mysterious man pays for it. A clumsy detective begins investigating and finds a crucial clue: a strongly scented woman's glove. The perfume is an expensive scent and the detective's pal realizes that it belongs to a popular nightclub singer. The friend quickly becomes enamored of the girl, but then so does her mystery man, a notorious international criminal. Eventually he gets arrested, leaving the detective's pal to move in on the singer.","release_date":"1933-01-01"},{"vote_count":1,"id":4324,"video":false,"vote_average":10,"title":"Venusberg","popularity":1.000498,"poster_path":"/2Jg2K6yyHje9OvehK8D9OK358nV.jpg","original_language":"de","original_title":"Venusberg","genre_ids":[18],"backdrop_path":null,"adult":false,"overview":"No overview found.","release_date":"1963-04-26"},{"vote_count":1,"id":2301,"video":false,"vote_average":10,"title":"Collin","popularity":1.11577,"poster_path":null,"original_language":"en","original_title":"Collin","genre_ids":[18],"backdrop_path":null,"adult":false,"overview":"No overview found.","release_date":"1981-12-06"},{"vote_count":1,"id":3212,"video":false,"vote_average":10,"title":"100 Years of Horror: The Frankenstein Family","popularity":1.13631,"poster_path":null,"original_language":"en","original_title":"100 Years of Horror: The Frankenstein Family","genre_ids":[99],"backdrop_path":null,"adult":false,"overview":"No overview found.","release_date":"1996-01-01"},{"vote_count":1,"id":3213,"video":false,"vote_average":10,"title":"100 Years of Horror: Baron Frankenstein","popularity":1.001103,"poster_path":"/mMHINvXdRJ0nMhGcVpY3GC1lIG8.jpg","original_language":"en","original_title":"100 Years of Horror: Baron Frankenstein","genre_ids":[99],"backdrop_path":null,"adult":false,"overview":"No overview found.","release_date":"1996-01-01"},{"vote_count":1,"id":5188,"video":false,"vote_average":10,"title":"Ocean of Dreams","popularity":1.000235,"poster_path":"/yPkVgs9fAeMkGJuYJ7JbjFNqGWu.jpg","original_language":"en","original_title":"Ocean of Dreams","genre_ids":[18],"backdrop_path":"/n8I6nYk2B8GYcEoJoX2DunevQaL.jpg","adult":false,"overview":"A married couple in search of erotic adventure climbs aboard a cruise ship to add some excitement to their bland and predicable routine. It doesn't take long for the sexually starved guests on board to get friendly \u2026 really friendly. Charlene Smith, Wesley O'Brian, Robert Donovan and Jody Frank co-star in this passionate romp at sea that explores the boundaries of danger and desire.","release_date":"1997-01-01"},{"vote_count":1,"id":7448,"video":false,"vote_average":10,"title":"Quiet Type","popularity":1.000025,"poster_path":null,"original_language":"en","original_title":"Quiet Type","genre_ids":[35,18],"backdrop_path":null,"adult":false,"overview":"No overview found.","release_date":""},{"vote_count":1,"id":6112,"video":false,"vote_average":10,"title":"Agatha Christie: A Life in Pictures","popularity":1.022166,"poster_path":"/hR3wdwdQyuoeHbVZT1e5GQIgq7U.jpg","original_language":"en","original_title":"Agatha Christie: A Life in Pictures","genre_ids":[10770,18],"backdrop_path":null,"adult":false,"overview":"A biopic of Agatha Christie including her 10 day disappearance.","release_date":"2004-09-22"},{"vote_count":1,"id":2796,"video":false,"vote_average":10,"title":"A Midsummer Night's Dream","popularity":1.142419,"poster_path":"/sNt9GpjstC3ZO5wlfrrHszKfK3B.jpg","original_language":"fr","original_title":"Le Songe d'une nuit d'été","genre_ids":[35],"backdrop_path":null,"adult":false,"overview":"A television adaptation of William Shakespeare's A Midsummer Night's Dream.","release_date":"1969-12-25"},{"vote_count":1,"id":2177,"video":false,"vote_average":10,"title":"Falco L.I.V.E.","popularity":1.079363,"poster_path":"/lxsmbv3oUpiVzEF23xg0zJLpbXl.jpg","original_language":"en","original_title":"Falco L.I.V.E.","genre_ids":[],"backdrop_path":"/90elGqBILXv9RUXMRQ2jJDWYou4.jpg","adult":false,"overview":"No overview found.","release_date":"1993-01-01"},{"vote_count":1,"id":2216,"video":false,"vote_average":10,"title":"Five Cartridges","popularity":1.236315,"poster_path":"/3cvZAUVP0gjP0p54TOVXQ50fEyZ.jpg","original_language":"de","original_title":"Fünf Patronenhülsen","genre_ids":[10752,18],"backdrop_path":null,"adult":false,"overview":"It is the year 1936 and the Spanish Civil War is raging. When the German commander of an international brigade is badly wounded he gives his five comrades a message which he divides up and secretes into in five cartridges. All five shells must reach the battalion in order for the message to be relayed. But Frenchman Pierre can\u2019t bear the heat of the Sierra. When he leaves their hide-out to drink from a well he is hit by an enemy bullet.","release_date":"1960-11-03"},{"vote_count":1,"id":190259,"video":false,"vote_average":10,"title":"Miss Else","popularity":1.069269,"poster_path":"/fjT9MwNr2Z5xdPZnX16UwtTcZJS.jpg","original_language":"de","original_title":"Fräulein Else","genre_ids":[18],"backdrop_path":null,"adult":false,"overview":"Fräulein Else (English: Miss Else) is a 1929 German silent drama film directed by Paul Czinner and starring Elisabeth Bergner, Albert Bassermann and Albert Steinrück. It was based on the 1924 novella of the same name by Arthur Schnitzler. Bergner had previously played her role on stage to great acclaim. However, it was felt that the film was hindered by being silent given the strength of the story's dialogue.","release_date":"1929-03-07"},{"vote_count":1,"id":193507,"video":false,"vote_average":10,"title":"Exile Family Movie","popularity":1.061119,"poster_path":"/fuY64Hdc7mgxbTmtlzorrLzY8WQ.jpg","original_language":"en","original_title":"Exile Family Movie","genre_ids":[99],"backdrop_path":null,"adult":false,"overview":"A family\u2019s story, typically crazy and exceptional at the same time. A film about home and exile, parents, grandparents, brothers and sisters and all the other relatives, close and distant, in an extended Persian family. Some of them emigrated to Europe or America, though the majority has stayed in Iran. Regardless of all the danger involved, they secretly meet after 20 years at a place which won\u2019t raise suspicion among the Iranian authorities: Mecca. They come from America, Sweden, Austria and Iran to laugh, argue, cook and celebrate. This is accompanied by an excessive amount of hugging and kissing, and also a clash between Muslim and Western cultures.","release_date":"2006-09-28"},{"vote_count":1,"id":190882,"video":false,"vote_average":10,"title":"Fatih","popularity":1.006912,"poster_path":"/hKFzpv54CNfmsXhnKUoiARVS3nx.jpg","original_language":"en","original_title":"Fatih","genre_ids":[18],"backdrop_path":"/aJ4t4imRa5H5SN57dUILcEth9BE.jpg","adult":false,"overview":"In this heartwarming story we meet Fatih, a boy of Turkish descent. He lives with his mother and sisters. The harmony in the family is disrupted when his macho uncle pays the family a visit.","release_date":"2012-05-30"}]
     */

    public Movie() {
    }

    private int page;
    private int total_results;
    private int total_pages;
    private List<ResultsBean> results;

    protected Movie(Parcel in) {
        page = in.readInt();
        total_results = in.readInt();
        total_pages = in.readInt();
        results = in.createTypedArrayList(ResultsBean.CREATOR);
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal_results() {
        return total_results;
    }

    public void setTotal_results(int total_results) {
        this.total_results = total_results;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(page);
        parcel.writeInt(total_results);
        parcel.writeInt(total_pages);
        parcel.writeTypedList(results);
    }

    public static class ResultsBean implements Parcelable {
        /**
         * vote_count : 1
         * id : 441580
         * video : false
         * vote_average : 10
         * title : The Jinx: The Life and Deaths of Robert Durst Season 1 Chapter 6: What the Hell Did I Do?
         * popularity : 1
         * poster_path : /9Hj2bqi955SvTa5zj7uZs6sic29.jpg
         * original_language : en
         * original_title : The Jinx: The Life and Deaths of Robert Durst Season 1 Chapter 6: What the Hell Did I Do?
         * genre_ids : [99]
         * backdrop_path : /3br0Rt90AkaqiwVBZVvVUYD1juQ.jpg
         * adult : false
         * overview :
         * release_date : 2015-03-15
         */

        private int vote_count;
        private int id;
        private boolean video;
        private double vote_average;
        private String title;
        private double popularity;
        private String poster_path;
        private String original_language;
        private String original_title;
        private String backdrop_path;
        private boolean adult;
        private String overview;
        private String release_date;
        private List<Integer> genre_ids;

        public ResultsBean() {
        }

        protected ResultsBean(Parcel in) {
            vote_count = in.readInt();
            id = in.readInt();
            video = in.readByte() != 0;
            vote_average = in.readDouble();
            title = in.readString();
            popularity = in.readDouble();
            poster_path = in.readString();
            original_language = in.readString();
            original_title = in.readString();
            backdrop_path = in.readString();
            adult = in.readByte() != 0;
            overview = in.readString();
            release_date = in.readString();
        }

        public static final Creator<ResultsBean> CREATOR = new Creator<ResultsBean>() {
            @Override
            public ResultsBean createFromParcel(Parcel in) {
                return new ResultsBean(in);
            }

            @Override
            public ResultsBean[] newArray(int size) {
                return new ResultsBean[size];
            }
        };

        public int getVote_count() {
            return vote_count;
        }

        public void setVote_count(int vote_count) {
            this.vote_count = vote_count;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public boolean isVideo() {
            return video;
        }

        public void setVideo(boolean video) {
            this.video = video;
        }

        public double getVote_average() {
            return vote_average;
        }

        public void setVote_average(double vote_average) {
            this.vote_average = vote_average;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public double getPopularity() {
            return popularity;
        }

        public void setPopularity(double popularity) {
            this.popularity = popularity;
        }

        public String getPoster_path() {
            return poster_path;
        }

        public void setPoster_path(String poster_path) {
            this.poster_path = poster_path;
        }

        public String getOriginal_language() {
            return original_language;
        }

        public void setOriginal_language(String original_language) {
            this.original_language = original_language;
        }

        public String getOriginal_title() {
            return original_title;
        }

        public void setOriginal_title(String original_title) {
            this.original_title = original_title;
        }

        public String getBackdrop_path() {
            return backdrop_path;
        }

        public void setBackdrop_path(String backdrop_path) {
            this.backdrop_path = backdrop_path;
        }

        public boolean isAdult() {
            return adult;
        }

        public void setAdult(boolean adult) {
            this.adult = adult;
        }

        public String getOverview() {
            return overview;
        }

        public void setOverview(String overview) {
            this.overview = overview;
        }

        public String getRelease_date() {
            return release_date;
        }

        public void setRelease_date(String release_date) {
            this.release_date = release_date;
        }

        public List<Integer> getGenre_ids() {
            return genre_ids;
        }

        public void setGenre_ids(List<Integer> genre_ids) {
            this.genre_ids = genre_ids;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(vote_count);
            parcel.writeInt(id);
            parcel.writeByte((byte) (video ? 1 : 0));
            parcel.writeDouble(vote_average);
            parcel.writeString(title);
            parcel.writeDouble(popularity);
            parcel.writeString(poster_path);
            parcel.writeString(original_language);
            parcel.writeString(original_title);
            parcel.writeString(backdrop_path);
            parcel.writeByte((byte) (adult ? 1 : 0));
            parcel.writeString(overview);
            parcel.writeString(release_date);
        }
    }
}
