package Interfases;

import java.util.List;

import Classes.Actor;
// поведение в магазин
public interface iMarketBehaviour {
    void acceptToMarket(Actor actor); //  пришел в магазин
    void releaseFromMarcet(List<Actor> actors); // ушел из магазина
    void update(); //обновить
    
}
