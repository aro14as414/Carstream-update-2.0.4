package com.thekirankumar.youtubeauto2.exoplayer;

/**
 * Created by kiran.kumar on 05/02/18.
 */

interface MediaQueue {
    void next();

    void previous();

    boolean hasNext();

    boolean hasPrevious();

    void resetPosition(int position);
}
