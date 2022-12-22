describe('Example test', () => {
    beforeAll(async () => {
        await device.launchApp({});
    });
        
    beforeEach(async () => {
        
    });
  
    it('should tap on the "click me" button and see clicked count', async () => {
        await element(by.id('buttonId')).tap()
        await expect(element(by.id('textId'))).toHaveText("You clicked 1 times");
        await element(by.id('buttonId')).tap()
        await expect(element(by.id('textId'))).toHaveText("You clicked 2 times");
    });
  });