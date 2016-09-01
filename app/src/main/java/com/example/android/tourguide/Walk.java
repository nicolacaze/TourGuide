package com.example.android.tourguide;

/**
 * This class defines the Walk object states and methods.
 * These walks will be displayed in a ListView in each level category.
 */
public class Walk {

    //Below are defined each states belonging to a Walk.

    //The name of the walk. Typically, the place.
    private int mName;

    //The duration of a walk in days.
    private String mDuration;

    //The level of each walk (easy, medium, hard).
    private String mLevel;

    //The resource ID of the picture of the walk.
    private int mPictureId;


    /**below is declared the public constructor.
     * @param name describes the full name of the walk.
     * @param duration is stated in days and describes the length of the walk.
     * @param level It can take the following value: 1 = easy, 2 = medium, 3 = hard.
     * @param pictureId stores the picture resource reference from the drawables.
     */

    public Walk(int name, int duration, int level, int pictureId) {
        mName = name;
        if(duration == 1) {
            mDuration = duration + " day";
        } else {
            mDuration = duration + " days";
        }
        if(level == 1) {
            mLevel = "easy";
        } else if (level == 2) {
            mLevel = "medium";
        } else {
            mLevel = "hard";
        }
        mPictureId = pictureId;
    }

    //Below are defined the getter public methods of the Walk class.
    public int getWalkName() {
        return mName;
    }

    public String getWalkDuration() {
        return mDuration;
    }

    public String getWalkLevel() {
        return mLevel;
    }

    public int getWalkPictureId() {
        return mPictureId;
    }


    //Defined the toString() method to display a String containing all Walk object data.

    @Override
    public String toString() {
        return "Walk{" +
                "mName='" + mName + '\'' +
                ", mDuration='" + mDuration + '\'' +
                ", mLevel=" + mLevel + '\'' +
                ", mPictureId=" + mPictureId +
                '}';
    }
}
