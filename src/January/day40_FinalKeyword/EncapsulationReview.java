package January.day40_FinalKeyword;

import January.day39_Recap.Circle;
import January.day39_Recap.Square;

public class EncapsulationReview {

    private Circle circle;
private Square square;

    public Circle getCircle(){
        return circle;
    }

    public void setCircle(Circle circle){
        this.circle = circle;
    }

    public Square getSquare(){
        return square;
    }

    public void setSquare(Square square){
        this.square = square;
    }

}
