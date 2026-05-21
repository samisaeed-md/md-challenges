const exchangeRatesURL = `https://open.er-api.com/v6/latest/GBP`;

const retrieveExchangeRates = async () => {
   const response = await fetch(exchangeRatesURL);
   const data = await response.json();
  
   console.log(`GBP: ${data.rates.GBP} | AMD: ${data.rates.AMD}`);

};

// Trigger the function to retrieve exchange rates
retrieveExchangeRates();