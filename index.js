const express = require('express');
const app = express();
app.get('/', (req, res) => {
  res.send('hi there1323 12')
});

app.listen(3080, () => {
  console.log('Listening at 3080')
})