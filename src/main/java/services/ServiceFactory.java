package services;

import services.interfaces.IService;

public class ServiceFactory {

    public IService create(EService eService){
        switch (eService){
            case BUY:
                return new BuyService();
            case AUTH:
                return new AuthorizationService();
            case SHOES:
                return new ShoesService();
            case CUSTOMER:
                return new CustomerService();
        }
        return null;
    }
}
