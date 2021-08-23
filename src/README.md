## Spring Boot 示例：AOP 实现简单权限控制

### 实现步骤

- 在控制器方法上使用 `@Permission` 注解来添加权限控制

- 在 `PermissionAop.doPermission()` 中进行权限控制逻辑