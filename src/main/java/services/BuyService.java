package services;

import domain.models.ShoppingCard;
import repositories.entities.BuyRepository;
import repositories.interfaces.IBuyRepository;


public class BuyService implements IService {
    private IBuyRepository buyRepository;
    public BuyService(){
        buyRepository= new BuyRepository();
    }
    public void buyingShoes(ShoppingCard sc){
        buyRepository.buyingShoes(sc);
    }

    @Override
    public boolean isService() {
        return true;
    }
}
