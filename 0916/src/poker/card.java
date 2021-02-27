package poker;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/16
 * TIME:19:38
 */
public class card {
    public String suit;
    public int rank;

    public card(String suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString(){
        return String.format("[%s %d]",suit,rank);
    }


    @Override
    public boolean equals(Object obj) {
        if(this==obj)return true;
        if(obj==null||!(obj instanceof card))return false;
        card card=(card)obj;
        return rank==card.rank&&suit.equals(card.suit);
    }
}
