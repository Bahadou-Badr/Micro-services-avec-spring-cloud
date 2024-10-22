## About this project 🏁

#### An application based on three business services :

- Customer Service
- Inventory Service
- Billing Service
- Authentication Service using Spring Security and JWT :
  This service manages :
  - Authentication
  - Users
  - Roles (USER, ADMIN, CUSTOMER_MANAGER, PRODUCT_MANAGER, BILLS_MANAGER) A user can have multiple roles, and each role can be assigned to multiple users.

#### Service orchestration is handled via Spring Cloud technical services :

- Spring Cloud Gateway Service as a proxy service
- Eureka Registry Service as a directory for service registration and discovery in the architecture
- Hystrix Circuit Breaker
- Hystrix Dashboard
