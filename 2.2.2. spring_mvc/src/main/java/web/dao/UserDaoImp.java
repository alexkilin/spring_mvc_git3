//package web.dao;
//
//
//
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class UserDaoImp implements UserDao {
//
//    @Autowired
//    private SessionFactory sessionFactory;
//
//    @Override
//    public void addCar(Car car) {
//        sessionFactory.getCurrentSession().save(car);
//    }
//
//
//    @Override
//    public void updateCar (Car car){
//        sessionFactory.getCurrentSession().update(car);
//    }
//
//
//
//    @Override
//    @SuppressWarnings("unchecked")
//    public List<Car> listCars() {
//        TypedQuery<Car> query=sessionFactory.getCurrentSession().createQuery("from car");
//        return query.getResultList();
//    }
//
//    @Override
//    public Car getCarByNumber (int number) {
//        Car result;
//        result = sessionFactory.openSession().get(Car.class,number);
//        return result;
//    }
//
//
//}
//
