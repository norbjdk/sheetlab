function Search() {
    return (
        <div className="relative w-full group">
            <input 
                type="text" 
                className="block w-full bg-[#403D39]/50 border border-transparent rounded-full py-2 pl-4 pr-4 text-[#FFFCF2] placeholder-[#CCC5B9] text-sm focus:outline-none focus:bg-[#403D39] focus:border-[#EB5E28]/50 focus:ring-2 focus:ring-[#EB5E28]/20 transition-all shadow-inner" 
                placeholder="Search sheet music..."
            />

            <div className="absolute inset-y-0 right-0 pr-3 flex items-center pointer-events-none transition-colors group-focus-within:text-[#EB5E28]">
                <svg 
                    className="h-4 w-4 text-[#CCC5B9]" 
                    fill="none" 
                    viewBox="0 0 24 24" 
                    stroke="currentColor">
                    <path strokeLinecap="round" strokeLinejoin="round" strokeWidth="2" d="M21 21l-6-6m2-5a7 7 0 11-14 0 7 7 0 0114 0z" />
                </svg>
            </div>
        </div>
    );
}

export default Search;