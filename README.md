# detox-sample
ReactNative sample app with UI tests in both detox and appium.

To run the UI test using detox:
From base dir: run React Server with `yarn ios`, then in a seperate terminal tab it's `detox test --configuration ios.sim.debug`

To run the UI test using appium:
Run appium server in one tab using `appium`, then in a seperate terminal tab run `mvn test` to run all tests.
