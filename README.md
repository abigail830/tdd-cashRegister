## 收银机问题
### 背景
* 收银机（CashRegister）连着一台打印机（Printer）
* 收银机处理（Process）一次购买行为时（Purchase），将使用打印机打印购买信息（Description) 
Purchase类已经开发完成

### 任务：
1. 假设真实打印机的API还不清楚, 请在不调用实际打印机对象的情况下，完成CashRegister#process的开发
2. 考虑process调用CashRegister中的calculateDiscount方法计算折扣，并一起打印出来；请在不实际调用calculateDiscount方法的情况下，完成process开发
