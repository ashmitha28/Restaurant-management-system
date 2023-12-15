Introduction
A restaurant reservations system helps users to manage all your bookings digitally and allows restaurant staffs to modify the seating availability. This can reduce those dreaded no shows and ensure maximizing all the available tables. Customers can also place orders through this portal and pay for it online. Instead of reserving the table manually, this technique makes it easier to see the available slots and reserve the table accordingly. Restaurant staff can now use this portal to manage their table availability and reduce no shows and track the customers and their orders.
The goals are not only to make it a table booking system, but also a full restaurant management system, allowing restaurant owners to manage their bookings, menus, and other information displayed on the software.
This project implements a simple Restaurant Management System using a MySQL database. It includes a set of stored procedures to manage staff, customers, orders, bookings, items, categories, and tables. This project implements a Restaurant Management System with a MySQL database and a Java Swing-based GUI using JFrame (version 11).
Teck stack:
MySQL Java
Database Schema
The database schema includes the following tables:

● staff: Information about hotel staff. The employee can modify the slot of a table depending on the
situation. A staff can modify 0 or many slots but a slot can be modified by only one staff member.

● customer: Details of customers. The customer can save one card and can use only card or cash to place any order. A particular card can be used by only one customer. The customer can also book tables in the restaurant at a particular slot. A customer can book a table at multiple slots. A customer can place multiple orders but an order can be placed by only 1 customer. This system is implemented for only one
restaurant and not multiple restaurants.

● slot: Contains the date and timeslot which are composite primary key.

● tables: Information about the table. Multiple tables can be booked at a particular timeslot.

● category: Categories for menu items.

● item: Menu items with rates and the category that item belongs to.

● orders: Details of customer orders.

Stored Procedures
Staff Management

● DisplayStaff(): Display details of staff members.

● AddStaff(...): Add a new staff member.

● RemoveStaff(...): Remove a staff member.

Customer Management

● DisplayCustomer(): Display details of customers.

● AddCustomer(...): Add a new customer.

● DeleteCustomer(...): Remove a customer. Slot Management

● DisplaySlot(): Display details of time slots.

● ManageSlots(...): Add or remove time slots. Table Management

● DisplayTable(): Display details of tables.

● ManageTable(...): Add or remove tables.

● GetBookedTableNumber(...): Get the table number booked at a given date and timeslot.

Category and Item Management

● DisplayCategory(): Display details of categories.

● DisplayItem(): Display details of menu items.

● ManageCategories(...): Add or remove categories.

● ManageItems(...): Add or remove menu items.

● ModifyItemRate(...): Modify the rate of a menu item.

Order Management

● DisplayOrder(): Display details of orders.

● Displayorder_contains_item(): Display details of items in orders.

● DisplayOrdersByUsername(...): Display orders made by a specific username.

● GenerateBill(...): Generate a bill for a specific order.

Booking Management

● BookSlot(...): Book a slot and a table for a customer.

User Authentication

● GetCustomerInfo(...): Get details of a customer by username and password.

● GetStaffInfo(...): Get details of staff by username and password.

Item Retrieval

● GetItemsByCategory(...): Get items by category.

● GetItemsByItem_name(...): Get details of an item by item_name.

Libraries used:

javax.swing- for creating the graphical user interface.
Java.sql. - Provides the API for accessing and processing data stored in mysql using the Java programming language.
Java Swing GUI
The frontend of this project is built using Java Swing, specifically version 11. The graphical user interface provides an interactive experience for users to interact with the Restaurant Management System. The GUI includes forms, buttons, tables, and other components to facilitate actions such as staff and customer management, order placement, table booking, slot updates, menu modification etc.
Dependencies

Ensure you have the following dependencies installed:

● Java Development Kit (JDK) version 11 or higher.

● MySQL Server

● JDBC Connector

● JCalendar

How to Run the Software

1. Download the Project Folder:
   
● Download the project file and extract it.

● Extract the zip RestaurantManagementSoftware.zip and open the dist folder.

● Extract the dump RestaurantDump.sql

2. Run the JAR File:
   
● Open a terminal or command prompt.

● Navigate to the ‘dist’ directory where the JAR file is located.

3.Explore the GUI:
cd path

● On the dist folder open a new terminal at that folder.

● Run the JAR file using the following command:

java -jar RestaurantManagementSoftware.jar
Note: Make sure that the jar file is triggered from the exact location as the dependencies are installed in reference to that path.

● Interact with the GUI to perform various actions related to staff, customers, ordering food, managing menu, booking slots, modifying slots etc.
