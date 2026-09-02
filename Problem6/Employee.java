package Problem6;

class Employee {

    int calculateBonus(){
         return 5000;
    }
    
}

class Manager extends Employee{
    @Override
   int calculateBonus(){
        return 10000;
    }
}
class Developer extends Manager{
    @Override
    int calculateBonus(){
        return 8000;
    }
}