package com.xiaoyu.nextday.bean;

/**
 * Created by Administrator on 2018/6/8.
 */

public class APIResultBean {
    private String dateKey;
    private String modifiedAt;
    private geoBean geo;
    private colorsBean colors;
    private musicBean music;
    private imagesBean images;
    private thumbnailBean thumbnail;

    public String getDateKey() {
        return dateKey;
    }

    public void setDateKey(String dateKey) {
        this.dateKey = dateKey;
    }

    public String getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public geoBean getGeo() {
        return geo;
    }

    public void setGeo(geoBean geo) {
        this.geo = geo;
    }

    public colorsBean getColors() {
        return colors;
    }

    public void setColors(colorsBean colors) {
        this.colors = colors;
    }

    public musicBean getMusic() {
        return music;
    }

    public void setMusic(musicBean music) {
        this.music = music;
    }

    public imagesBean getImages() {
        return images;
    }

    public void setImages(imagesBean images) {
        this.images = images;
    }

    public thumbnailBean getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(thumbnailBean thumbnail) {
        this.thumbnail = thumbnail;
    }

    public static class geoBean {
        private String reverse;

        public String getReverse() {
            return reverse;
        }

        public void setReverse(String reverse) {
            this.reverse = reverse;
        }
    }

    public static class colorsBean {
        private String background;

        public String getBackground() {
            return background;
        }

        public void setBackground(String background) {
            this.background = background;
        }
    }

    public static class musicBean {
        private String title;
        private String artist;
        private String url;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getArtist() {
            return artist;
        }

        public void setArtist(String artist) {
            this.artist = artist;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    public static class imagesBean {
        private String small;
        private String small2x;
        private String small568h2x;
        private String big;
        private String big2x;
        private String big568h2x;
        private String big568h3x;

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getSmall2x() {
            return small2x;
        }

        public void setSmall2x(String small2x) {
            this.small2x = small2x;
        }

        public String getSmall568h2x() {
            return small568h2x;
        }

        public void setSmall568h2x(String small568h2x) {
            this.small568h2x = small568h2x;
        }

        public String getBig() {
            return big;
        }

        public void setBig(String big) {
            this.big = big;
        }

        public String getBig2x() {
            return big2x;
        }

        public void setBig2x(String big2x) {
            this.big2x = big2x;
        }

        public String getBig568h2x() {
            return big568h2x;
        }

        public void setBig568h2x(String big568h2x) {
            this.big568h2x = big568h2x;
        }

        public String getBig568h3x() {
            return big568h3x;
        }

        public void setBig568h3x(String big568h3x) {
            this.big568h3x = big568h3x;
        }
    }

    public static class thumbnailBean {
        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
