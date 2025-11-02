import React, {useEffect, useState} from 'react'


export default function App(){
const [items, setItems] = useState([])
useEffect(()=>{
fetch('/api/items')
.then(r=>r.json())
.then(setItems)
.catch(console.error)
},[])


return (
<div style={{padding:20,fontFamily:'Arial'}}>
<h1>Fullstack Example</h1>
<p>Items from backend:</p>
<ul>
{items.map(it=> <li key={it.id}>{it.name}</li>)}
</ul>
</div>
)
}
