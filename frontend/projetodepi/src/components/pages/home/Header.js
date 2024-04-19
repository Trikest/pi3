// import Nav from './../../routes/Nav';
// import styles from './Header.module.css';
import styles from './Nav.module.css';
import DropdownMenu from './../../routes/MenuHome';
import { Link } from 'react-router-dom';

function Header (){
    return(
        <>
        <header>
        <nav >         
        <ul className={styles.navEstilo}>
        <li className={styles.item}><Link to="/">Home</Link></li>
        <li className={styles.item}><DropdownMenu/></li>
        <li className={styles.item}><Link to="/LoginPage">Login</Link></li>
        <li className={styles.item}><Link to="/QuemSomos">Quem somos</Link></li>

      </ul>          
        </nav>
        </header>
        </>
        
    )
}
export default Header;

