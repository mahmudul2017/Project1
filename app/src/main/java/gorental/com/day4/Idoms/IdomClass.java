package gorental.com.day4.Idoms;

public class IdomClass {

        String eng_name;
        String ban_name;
        int imageId;

        public IdomClass(String eng_name, String ban_name, int imageId) {
            this.eng_name = eng_name;
            this.ban_name = ban_name;
            this.imageId = imageId;
        }

        public String getEng_name() {
            return eng_name;
        }

        public String getBan_name() {
            return ban_name;
        }

        public int getImageId() {
            return imageId;
        }
    }

