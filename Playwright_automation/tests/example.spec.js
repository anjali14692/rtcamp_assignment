// @ts-check
const { test, expect } = require('@playwright/test');

test('amazon site', async ({page}) =>{
  await page.goto('https://www.amazon.com/')
  await expect(page).toHaveTitle('Amazon.com. Spend less. Smile more.')
})