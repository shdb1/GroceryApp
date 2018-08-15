# GroceryApp

How to run app:
Download attached jar and go to the directory where jar downloaded:
Run below command and execute below URLS in browser.
Java –jar groceryapp-beta.jar
1. API to initialize the (in memory initialization)
http://localhost:8080/initializeapp

2.To see the available inventory at any point
http://localhost:8080/inventorydetails

3. To check available discount offers
http://localhost:8080/discount/getdiscountinfo

4. To perform any transactions, We need to pass itemUniqueCode available in inventory details , quantitySold is the number of quantity want to sell, discountApplied={none or offer shown by discount api}
http://localhost:8080/sale/saleitem?itemUniqueCode=item1bak&quantitySold=1&discountApplied=internalStaffOffer

5.To see all the transactions 

http://localhost:8080/sale/allsold
