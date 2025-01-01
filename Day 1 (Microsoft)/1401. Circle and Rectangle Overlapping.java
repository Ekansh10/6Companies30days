class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int closestX;
        int closestY;

        if(xCenter <= x1){
            closestX = x1;
        }else if(xCenter >= x2){
            closestX = x2;
        }else{
            closestX = xCenter;
        }

        if(yCenter <= y1){
            closestY = y1;
        }else if(yCenter >= y2){
            closestY = y2;
        }else{
            closestY = yCenter;
        }

        int dist = (((closestX - xCenter)*(closestX - xCenter)) + ((closestY - yCenter)*(closestY - yCenter)));
        double sq_dist = Math.sqrt(dist);
        if(sq_dist > radius){
            return false;
        }
        return true;

    }
}
