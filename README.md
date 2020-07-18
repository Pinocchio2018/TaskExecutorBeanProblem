# TaskExecutorBeanProblem
A personal Java Bean named 'TaskExecutor' will cause Spring boot start problem

```
***************************
APPLICATION FAILED TO START
***************************

Description:

Field executor in com.example.bussiness.service.DemoService required a bean of type 'com.example.executor.TaskExecutor' that could not be found.

The injection point has the following annotations:
	- @org.springframework.beans.factory.annotation.Autowired(required=true)


Action:

Consider defining a bean of type 'com.example.executor.TaskExecutor' in your configuration.
```

if register personal TaskExecutor with another bean name, the project start fine.