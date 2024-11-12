package supermarket;

public class Main {
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket("SuperMart", "Main Street 123");
        Employee employee = new Employee("Alice", 3000);
        Product product = new Product("Milk", 2.5);
        Customer customer = new Customer("Bob", "bob@example.com");
        
        System.out.println("Supermarket: " + supermarket.getName() + " located at " + supermarket.getLocation());
        System.out.println("Employee: " + employee.getName() + " with salary $" + employee.getSalary());
        System.out.println("Product: " + product.getProductName() + " costs $" + product.getPrice());
        System.out.println("Customer: " + customer.getName() + " email: " + customer.getEmail());
    }
}
