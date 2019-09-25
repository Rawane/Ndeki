const React = require('react');
const ReactDOM = require('react-dom');
import Partenaire from './Partenaire';
class App extends React.Component {
	  render() {
	    return (
	      <div className="App">
	        <h1>Hello, React!</h1>
	        <Partenaire />
	      </div>
	    )
	  }
	}
ReactDOM.render(
		<App />,
		document.getElementById('ndeki')
	)