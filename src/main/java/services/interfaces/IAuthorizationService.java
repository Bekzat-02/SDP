package services.interfaces;

import domain.AccessToken;
import domain.CustomerLoginData;
import domain.models.Customer;

public interface IAuthorizationService extends IService {
    AccessToken authenticateCustomer(CustomerLoginData data) throws Exception;
    Customer getCustomerByEmail(String email);
}
