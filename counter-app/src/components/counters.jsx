import React, { Component } from 'react';

import Counter from './counter';

class Counters extends Component {
    state = {
        counters :[
            {id:1,value: 4},
            {id:2,value: 0},
            {id:3,value: 0},
            {id:4,value: 0}
        ]
    }
    handleDelete=(counterId) => {
        const counters = this.state.counters.filter(c => c.id !== counterId);
        this.setState({counters});
    };
    handleReset=()=>{
const counters = this.state.counters.map(c=>{
    c.value = 0;
    return c;
});
this.setState({counters});
    };
    handleIncrement=counter=>{

    };
    render() {
        
        return (
            <div>
                <button
                onClick={this.hadleReset}
                 className="btn btn-primary btn-sm m-2">Reset</button>
                {this.state.counters.map(counters => 
                <Counter 
                key={counters.id} 
                onDelete={this.handleDelete} 
                onIncrement={this.handleIncrement}
                value={counters.value}
                id={counters.id}
                />

            
                
                
                )}
            </div>
        );
    }
}

export default Counters;