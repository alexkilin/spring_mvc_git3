//package web.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//
//import java.util.List;
//import web.model.Car;
//@Service
//public class UserServiceImp implements UserService {
//
//    @Autowired
//    private UserDao userDao;
//
//    @Transactional
//    @Override
//    public void addCar(Car car) {
//        userDao.addCar(car);
//    }
//
//    @Transactional(readOnly = true)
//    @Override
//    public List<Car> listCars() {
//        return userDao.listCars();
//    }
//
//    @Transactional
//    @Override
//    public void updateCar (Car car) {
//        userDao.updateCar(car);
//    }
//
//    @Override
//    public Car getCarByNumber (int number){
//        return userDao.getCarByNumber(number);
//    }
//
//
//
//}
