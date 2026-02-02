import { Link } from "react-router-dom";
import Search from "./Search";

function Navbar() {
    return (
        <nav className="bg-[#252422]/90 backdrop-blur-md border-b border-[#CCC5B9]/10 shadow-lg p-4 font-sans w-full fixed top-0 z-50 transition-all">
            {/* Desktop */}
            <div className="mx-auto hidden md:grid grid-cols-3 items-center w-[80%]">
                <div className="flex items-center gap-6">
                    <Link 
                        to="/scores" 
                        className="text-[#FFFCF2] text-sm font-medium hover:text-[#EB5E28] transition-colors relative group">
                        Scores
                        <span className="absolute -bottom-1 left-0 w-0 h-0.5 bg-[#EB5E28] transition-all group-hover:w-full"></span>
                    </Link>
                    <div className="w-full max-w-100">
                        <Search />
                    </div>
                </div>
                <div className="flex justify-center">
                    <Link 
                        to="/" 
                        className="text-2xl font-bold tracking-tighter text-[#FFFCF2] hover:scale-105 transition-transform flex items-center gap-1">
                        <span className="w-8 h-8 bg-[#EB5E28] rounded-lg flex items-end justify-center text-[#252422] text-lg font-black">C</span>
                        hordly
                    </Link>
                </div>
                <div className="flex justify-end items-center gap-8">
                    <Link 
                        to="/download" 
                        className="text-[#CCC5B9] text-sm hover:text-[#FFFCF2] transition-colors">
                        Download
                    </Link>
                    <Link 
                        to="/support" 
                        className="text-[#CCC5B9] text-sm hover:text-[#FFFCF2] transition-colors">
                        Support
                    </Link>
                    <Link 
                        to="/account" 
                        className="px-5 py-2 bg-[#FFFCF2] text-[#252422] rounded-full text-sm font-bold hover:bg-[#EB5E28] hover:text-[#FFFCF2] transition-all">
                        Account
                    </Link>
                </div>
            </div>

            {/* Mobile */}
            <div className="md:hidden flex justify-between items-center">
                 <Link 
                        to="/" 
                        className="text-2xl font-bold tracking-tighter text-[#FFFCF2] hover:scale-105 transition-transform flex items-center gap-1">
                        <span className="w-8 h-8 bg-[#EB5E28] rounded-lg flex items-end justify-center text-[#252422] text-lg font-black">C</span>
                        hordly
                    </Link>
                 <button className="text-[#FFFCF2]">
                    <svg className="w-6 h-6" fill="none" stroke="currentColor" viewBox="0 0 24 24"><path strokeLinecap="round" strokeLinejoin="round" strokeWidth="2" d="M4 6h16M4 12h16m-7 6h7"></path></svg>
                 </button>
            </div>
        </nav>
    );
}

export default Navbar;