import { Link } from "react-router-dom";

function Footer() {
    return (
        <footer className="bg-[#252422] border-t border-[#CCC5B9]/10 pt-12 pb-6 px-4 font-sans shadow-2xl">
            <div className="min-w-9/12 max-w-full mx-auto">
                <div className="grid grid-cols-1 md:grid-cols-4 gap-12 mb-12">
                    <div className="col-span-1 md:col-span-1">
                        <Link to="/" className="text-[#FFFCF2] font-bold text-xl tracking-tighter flex items-center gap-2 mb-4">
                            <span className="w-6 h-6 bg-[#EB5E28] rounded flex items-center justify-center text-[#252422] text-sm font-black">C</span>
                            Chordly
                        </Link>
                        <p className="text-[#CCC5B9] text-sm leading-relaxed">
                            The open-source studio for modern composers. Write, share, and play music without barriers.
                        </p>
                    </div>

                    <div>
                        <h4 className="text-[#FFFCF2] font-bold mb-4 text-sm uppercase tracking-widest">App</h4>
                        <ul className="space-y-2 text-sm text-[#CCC5B9]">
                            <li><Link to="/scores" className="hover:text-[#EB5E28] transition-colors">Browse Scores</Link></li>
                            <li><Link to="/download" className="hover:text-[#EB5E28] transition-colors">Desktop App</Link></li>
                        </ul>
                    </div>

                    <div>
                        <h4 className="text-[#FFFCF2] font-bold mb-4 text-sm uppercase tracking-widest">Community</h4>
                        <ul className="space-y-2 text-sm text-[#CCC5B9]">
                            <li><a href="https://github.com" className="hover:text-[#EB5E28] transition-colors">GitHub</a></li>
                            <li><Link to="/contribute" className="hover:text-[#EB5E28] transition-colors">Contribute</Link></li>
                            <li><Link to="/forum" className="hover:text-[#EB5E28] transition-colors">Discussions</Link></li>
                        </ul>
                    </div>

                    <div>
                        <h4 className="text-[#FFFCF2] font-bold mb-4 text-sm uppercase tracking-widest">Support</h4>
                        <ul className="space-y-2 text-sm text-[#CCC5B9]">
                            <li><Link to="/help" className="hover:text-[#EB5E28] transition-colors">Help Center</Link></li>
                            <li><Link to="/privacy" className="hover:text-[#EB5E28] transition-colors">Privacy Policy</Link></li>
                            <li><Link to="/copyright" className="hover:text-[#EB5E28] transition-colors">Copyright</Link></li>
                        </ul>
                    </div>
                </div>

                <div className="border-t border-[#CCC5B9]/10 pt-8 flex flex-col md:row justify-between items-center gap-4">
                    <p className="text-[#CCC5B9] text-xs">
                        &copy; {new Date().getFullYear()} Chordly Music Software. Released under MIT License.
                    </p>
                    <div className="flex gap-6">
                        <a href="#" className="text-[#CCC5B9] hover:text-[#FFFCF2] transition-colors text-xs font-medium italic">Discord</a>
                        <a href="#" className="text-[#CCC5B9] hover:text-[#FFFCF2] transition-colors text-xs font-medium italic">Instagram</a>
                        <a href="#" className="text-[#CCC5B9] hover:text-[#FFFCF2] transition-colors text-xs font-medium italic">X</a>
                    </div>
                </div>
            </div>
        </footer>
    );
}

export default Footer;