package poker;

import com.sun.deploy.net.MessageHeader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/16
 * TIME:19:40
 */
public class Game {
    public static void main(String[] args) {

        //玩家
        List<Palyer> playerList=new ArrayList<>();
        playerList.add(new Palyer("周润发"));
        playerList.add(new Palyer("刘德华"));
        playerList.add(new Palyer("高博"));
        playerList.add(new Palyer("陈沛鑫"));
        playerList.add(new Palyer("许之琛"));
        List<card> cardList =new ArrayList<>();
        //初始化牌面
        initializecards(cardList);
        System.out.println(cardList);
        //洗牌
        Collections.shuffle(cardList);
        System.out.println(cardList);
        //发牌
        int n=4;
        for(int i=0;i<n;i++){
            for(Palyer player:playerList){
                //从牌组中抽一张 放到当前玩家的手中
                card card =cardList.remove(0);
                player.cardList.add(card);
            }
        }
        card toFoundCard=new card("♠",1);
        Palyer 周润发=playerList.get(0);
        if(!周润发.cardList.contains(toFoundCard)) {
            周润发.cardList.set(0,toFoundCard);
        }
        Random random=new Random();
        for(int i=0;i<playerList.size();i++){
            Palyer currentPlayer=playerList.get(i);
            Palyer nextPlayer=playerList.get(i!=playerList.size()-1?i+1:0);
            int toDrawIndex=random.nextInt(nextPlayer.cardList.size());
            card drawCard=nextPlayer.cardList.remove(toDrawIndex);
            currentPlayer.cardList.add(drawCard);
        }
        for(Palyer player:playerList){
            for(card card:player.cardList){
                if(card.equals(toFoundCard)){
                    System.out.println(player.name+"获胜");
                    return;
                }
            }
        }
    }

    private static void initializecards(List<card> cards){
        for(String suit:new String[]{"♠","♦","♥","♣"}){
            for(int rank=1;rank<=5;rank++){
                card card=new card(suit,rank);
                cards.add(card);
            }
        }
    }
}
