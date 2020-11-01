package services;

import domain.models.Customer;
import repositories.entities.CustomerRepository;
import repositories.interfaces.ICustomerRepository;
import services.interfaces.IService;

public class CustomerService implements IService {
    private ICustomerRepository csRepo;
    private Customer cs=new Customer();

    public CustomerService() {
        csRepo = CustomerRepository.getInstance();
    }

    public void addCustomer(String fname,String lname,String email,String password){

        Customer customer=new Customer(fname,lname,email,password);
        if(fname!=null&&lname!=null&&email!=null&&password!=null) {
            csRepo.add(customer);
        }
    }

    public Customer getCustomerByID(long id){
        return csRepo.getCustomerByID(id);
    }

    @Override
    public boolean isService() {
        return true;
    }
}
